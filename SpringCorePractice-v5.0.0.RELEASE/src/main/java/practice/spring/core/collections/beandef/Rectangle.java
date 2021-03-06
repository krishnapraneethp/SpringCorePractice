package practice.spring.core.collections.beandef;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

import practice.spring.core.utilities.shapes.Point;
import practice.spring.core.utilities.shapes.Shape;
import practice.spring.core.utilities.shapes.Shapes;

public class Rectangle extends Shapes  implements Shape {
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
