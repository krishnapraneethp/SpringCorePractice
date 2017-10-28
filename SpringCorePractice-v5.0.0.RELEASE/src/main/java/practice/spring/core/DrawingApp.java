package practice.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.spring.core.utilities.shapes.Shape;

public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext= null;
		try {
			applicationContext = new ClassPathXmlApplicationContext("spring.xml");
			applicationContext.registerShutdownHook();
			Shape rectangle = (Shape) applicationContext.getBean("triangle");
			System.out.println(rectangle.draw());
		} finally {
			applicationContext.close();
		}
			
			
	}
}