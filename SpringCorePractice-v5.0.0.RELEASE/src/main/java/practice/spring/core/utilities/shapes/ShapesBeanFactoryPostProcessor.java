package practice.spring.core.utilities.shapes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import practice.spring.core.shapes.Triangle;

public class ShapesBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		Triangle triangle = (Triangle)beanFactory.getBean("triangle_singleton");
		System.out.println("ShapesBeanFactoryPostProcessor in action: "+triangle.draw());
	}

}