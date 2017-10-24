package practice.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.spring.core.utilities.shapes.Shapes;

public class DrawingApp {

	public static void main(String[] args) {
			AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("shapes.xml");
			applicationContext.registerShutdownHook();
			Shapes triangle = (Shapes) applicationContext.getBean("shapes");
			System.out.println("A triangle was drawn: "+triangle.draw());
			applicationContext.close();
	}
}