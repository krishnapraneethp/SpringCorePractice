package practice.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import practice.spring.core.shapes.Triangle;

public class DrawingApp {

	public static void main(String[] args) {
//		Triangle triangle = new Triangle();
		BeanFactory  beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle) beanFactory.getBean("triangle");
		triangle.draw();
	}

}
