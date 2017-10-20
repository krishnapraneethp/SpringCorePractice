package practice.spring.core.shapes;

import practice.spring.core.shapes.utilities.Point;
import practice.spring.core.shapes.utilities.TriangleDescr;

public class Triangle extends Shape {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private TriangleDescr triangleDescr;

	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public TriangleDescr getTriangleDescr() {
		return triangleDescr;
	}
	public void setTriangleDescr(TriangleDescr triangleDescr) {
		this.triangleDescr = triangleDescr;
	}
	
	
	@Override
	public String toString() {
		return " with coordinates " + "(" + this.getPointA().getX() + "," + this.getPointA().getY()
				+ ")," + "(" + this.getPointB().getX() + "," + this.getPointB().getY() + ")," + "("
				+ this.getPointC().getX() + "," + this.getPointC().getY() + "). "+this.getTriangleDescr();
	}

	@Override
	public String draw() {
		return this.toString();
	}

}
