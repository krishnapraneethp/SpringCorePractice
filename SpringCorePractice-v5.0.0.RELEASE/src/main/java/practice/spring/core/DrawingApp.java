package practice.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.spring.core.shapes.Shape;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("shapes.xml");
		Shape shape = (Shape) applicationContext.getBean("shapes");
		System.out.println(shape.draw());
	}
	
}