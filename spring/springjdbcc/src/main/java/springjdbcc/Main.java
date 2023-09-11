package springjdbcc;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ContextConfig.class);
		
		MovieDAO md = container.getBean("moviedao",MovieDAO.class);
//		Movies m = new Movies();
//		m.setId(30);
//		m.setName("Rowdy");
//		m.setRating(5);
//		m.setDate(LocalDate.now());
//		int n = md.save(m);
		System.out.println(md.findByID(1));
//		System.out.println(n+"..records added");
	}

}
