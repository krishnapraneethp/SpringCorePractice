package practice.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.spring.core.shapes.Rectangle;

public class DrawingApp {

	public static void main(String[] args) {
			AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
			applicationContext.registerShutdownHook();
			Rectangle rectangle = (Rectangle) applicationContext.getBean("rectangle");
			System.out.println("A triangle was drawn: "+rectangle.draw());
			applicationContext.close();
	}
}