package practice.spring.core.utilities.shapes;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import practice.spring.core.autowire.bytype.TriangleAW;
import practice.spring.core.shapes.Circle;
import practice.spring.core.shapes.Rectangle;
import practice.spring.core.shapes.Triangle;

public class Shapes implements Shape, ApplicationContextAware, BeanNameAware {
	
	private List<Point> points;
	private TriangleAW triangle;
	private Rectangle rectangle;
	private Circle circle;
	private String beanName;
	private ApplicationContext applicationContext;
	public TriangleAW getTriangle() {
		return triangle;
	}
	public void setTriangle(TriangleAW triangle) {
		this.triangle = triangle;
	}
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	@Override
	public String toString() {
		return "A triangle was drawn: "+this.getTriangle()+", "
				+"a rectangle was drawn: "+ this.getRectangle()+" and a circle was drawn: "+this.getCircle();
	}
	
	public void drawVariousShapes() {
		ApplicationContext applicationContext = this.getApplicationContext();
		Triangle triangle = (Triangle)applicationContext.getBean("triangle");
		Rectangle rectangle = (Rectangle)applicationContext.getBean("rectangle");
		System.out.println("A triangle was drawn using the bean '"+this.getBeanName()+"': "+triangle.draw());
		System.out.println("A rectangle was drawn using the bean '"+this.getBeanName()+"': "+rectangle.draw());
	}
	
	@Override
	public String draw() {
		return this.toString();
	}
	
	public String getBeanName() {
		return beanName;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void myGlobalInitMethod() {
		System.out.println("My Global Init method is called");
	}
	
	public void myGlobalDestroyMethod() {
		System.out.println("My Global Destroy method is called");
	}
}
