package springjdbcc;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ContextConfig.class);
		
		JdbcTemplate jd = container.getBean("jdbcTemplate",JdbcTemplate.class);
		
		System.out.println(jd);
		
		String q = "select * from movies";
		
		List<Movies> movielist = jd.query(q, new BeanPropertyRowMapper<Movies>(Movies.class));
		
		System.out.println(movielist);
		
		container.close();
		container.registerShutdownHook();
	}

}
