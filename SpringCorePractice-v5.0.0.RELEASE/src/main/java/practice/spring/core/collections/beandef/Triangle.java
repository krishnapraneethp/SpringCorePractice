package practice.spring.core.collections.beandef;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import practice.spring.core.shapes.utilities.Point;
import practice.spring.core.shapes.utilities.Shape;
import practice.spring.core.shapes.utilities.Shapes;

public class Triangle extends Shapes implements Shape, ApplicationContextAware {

	private List<Point> points;
	private ApplicationContext applicationContext;
	
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public Triangle() {
	}
	
	@Override
	public String draw() {
		StringBuilder stringBuilder = (StringBuilder) applicationContext.getBean("stringBuilder");
		stringBuilder.append("coordinates " );
		for(Point point:this.getPoints()) {
			stringBuilder.append("(" + point.getX() + "," + point.getY() + ")");
		}
		return stringBuilder.toString();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
