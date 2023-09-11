package springjdbcc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("moviedao")
public class MovieDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Movies> findALL(){
		return jdbcTemplate.query("select * from movies", new BeanPropertyRowMapper<Movies>(Movies.class));
	}
	
	
	public Movies findByID(int id) {
		String q = "select * from movies where id=?";
		Object param[] = {1};
		return jdbcTemplate.queryForObject(q,Movies.class,param,new BeanPropertyRowMapper<Movies>(Movies.class));//here movie.class in start is to tell that return the object in type movie
	}
	
	public int save(Movies m) {
		String q = "insert into movies values(?,?,?,?)";
		Object param[] = {m.getId(),m.getName(),m.getRating(),m.getDate()};
		return jdbcTemplate.update(q,param);
	}
	
	public int delete(Movies m) {
		String q = "delete from movies where id=?";
		Object param[] = {m.getId()};
		return jdbcTemplate.update(q,param);
	}

}
