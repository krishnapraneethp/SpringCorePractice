package practice.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.spring.core.shapes.utilities.Shapes;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("shapes.xml");
		Shapes shapes = (Shapes) applicationContext.getBean("shapes_autowiring_bytype");
//		shapes.drawVariousShapes();
		System.out.println(shapes.draw());
	}
}