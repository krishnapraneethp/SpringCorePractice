package practice.spring.core.shapes;

import practice.spring.core.utilities.shapes.Point;
import practice.spring.core.utilities.shapes.Shape;

public class Circle implements Shape {
	
	private Point center;
	
	@Override
	public String toString() {
		return "with center ("+this.getCenter().getX()+","+this.getCenter().getY()+")";
	}
	
	@Override
	public String draw() {
		return this.toString();
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	
}
