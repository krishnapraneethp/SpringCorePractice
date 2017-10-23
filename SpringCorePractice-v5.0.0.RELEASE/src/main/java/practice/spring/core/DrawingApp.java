package practice.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.spring.core.beanscopes.BasicBeanScopes;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("shapes.xml");
		System.out.println(BasicBeanScopes.protoTypeScope(applicationContext));
		System.out.println(BasicBeanScopes.singletonScope(applicationContext));
	}
}