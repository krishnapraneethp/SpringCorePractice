package practice.spring.core.autowire.bytype;

import practice.spring.core.shapes.Circle;
import practice.spring.core.shapes.Rectangle;
import practice.spring.core.shapes.utilities.Shape;

public class Shapes implements Shape {
	private Triangle triangle;
	private Rectangle rectangle;
	private Circle circle;
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
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
	
	@Override
	public String draw() {
		return this.toString();
	}
	
}
