package practice.spring.core.beanscopes;

import org.springframework.context.ApplicationContext;

import practice.spring.core.shapes.Triangle;

/**
 * In @prototype beanscope for every 
 * @author krishnapraneethp
 *
 */

public class BasicBeanScopes {
	public static boolean protoTypeScope(ApplicationContext applicationContext) {
		Triangle protoTypeObj1 = (Triangle) applicationContext.getBean("triangle-scope-prototype");
		Triangle protoTypeObj2 = (Triangle) applicationContext.getBean("triangle-scope-prototype");
		return protoTypeObj1.equals(protoTypeObj2);
	}
	public static boolean singletonScope(ApplicationContext applicationContext) {
		Triangle singletonObj1 = (Triangle) applicationContext.getBean("triangle-scope-singleton");
		Triangle singletonObj2 = (Triangle) applicationContext.getBean("triangle-scope-singleton");
		return singletonObj1.equals(singletonObj2);
	}
}
