package practice.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.spring.core.utilities.shapes.Shape;

public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
		try {
			applicationContext.registerShutdownHook();
			Shape shape = (Shape) applicationContext.getBean("circle");
			System.out.println(shape.draw());
		} finally {
			applicationContext.close();
		}
	}
}