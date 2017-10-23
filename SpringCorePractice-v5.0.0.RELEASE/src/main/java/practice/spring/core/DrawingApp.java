package practice.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.spring.core.autowire.bytype.Shapes;



public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("shapes.xml");
		Shapes shape = (Shapes) applicationContext.getBean("shapes_autowiring_bytype");
		System.out.println(shape.draw());
	}
	
}