package practice.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.spring.core.shapes.utilities.Shapes;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Shapes rectangle = (Shapes) applicationContext.getBean("rectangle");
		Shapes triangle = (Shapes) applicationContext.getBean("triangle");
		System.out.println("A rectangle was drawn: "+rectangle.draw());
		System.out.println("A triangle was drawn: "+triangle.draw());
	}
}