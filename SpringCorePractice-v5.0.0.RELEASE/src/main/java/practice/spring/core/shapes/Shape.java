/**
 * 
 */
package practice.spring.core.shapes;

import java.util.Map;

/**
 * @author krishnapraneethp
 *
 */
public class Shape {
	private Map<String, Triangle> triangleMap;
	private Map<String, Rectangle> rectangleMap;

	public Map<String, Triangle> getTriangleMap() {
		return triangleMap;
	}

	public void setTriangleMap(Map<String, Triangle> triangleMap) {
		this.triangleMap = triangleMap;
	}

	public Map<String, Rectangle> getRectangleMap() {
		return rectangleMap;
	}

	public void setRectangleMap(Map<String, Rectangle> rectangleMap) {
		this.rectangleMap = rectangleMap;
	}

	@Override
	public String toString() {
		return "A triangle was drawn: "+this.getTriangleMap().get("triangle1").toString() 
				+".\nA rectangle was drawn: "+ this.getRectangleMap().get("rectangle1");
	}
	
	public String draw() {
		return this.toString();
	}
}