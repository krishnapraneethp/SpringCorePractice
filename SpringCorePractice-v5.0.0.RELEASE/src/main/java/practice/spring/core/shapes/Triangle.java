package practice.spring.core.shapes;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import practice.spring.core.shapes.utilities.Point;
import practice.spring.core.shapes.utilities.Shape;
import practice.spring.core.shapes.utilities.TriangleDescr;

public class Triangle implements Shape, InitializingBean, DisposableBean {

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
	public Triangle() {
	}
	
	/**
	 * @param pointA
	 * @param pointB
	 * @param pointC
	 * @param triangleDescr
	 */
	public Triangle(Point pointA, Point pointB, Point pointC, TriangleDescr triangleDescr) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.triangleDescr = triangleDescr;
	}
	
	
	@Override
	public String toString() {
		return "coordinates " + "(" + this.getPointA().getX() + "," + this.getPointA().getY()
				+ ")," + "(" + this.getPointB().getX() + "," + this.getPointB().getY() + ")," + "("
				+ this.getPointC().getX() + "," + this.getPointC().getY() + "). "+this.getTriangleDescr();
	}

	@Override
	public String draw() {
		return this.toString();
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean is being destroyed");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean is being initialized");
	}

	public void myInitMethod() {
		System.out.println("My Init method is called");
	}
	
	public void myDestroyMethod() {
		System.out.println("My Destroy method is called");
	}
	
}
