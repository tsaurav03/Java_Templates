package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSc {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-config.xml")) {
			System.out.println("Sc up and running !");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
