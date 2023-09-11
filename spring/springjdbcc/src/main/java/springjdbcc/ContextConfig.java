package springjdbcc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan(basePackages = {"springjdbcc"})
public class ContextConfig {
	@Bean
	public DriverManagerDataSource driverManagerDataSource() {
	DriverManagerDataSource ds = new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:/hsbc");
	ds.setUsername("root");
	ds.setPassword("Agra@282005");
	return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	jdbcTemplate.setDataSource(driverManagerDataSource());
	return jdbcTemplate;
	}

}
