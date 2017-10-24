/**
 * 
 */
package practice.spring.core.utilities.shapes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author krishnapraneethp
 *
 */
public class ShapesBeanPostProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+" was drawn from postProcessBeforeInitialization method");
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+" was drawn from postProcessAfterInitialization method");
		return bean;
	}
	
}
