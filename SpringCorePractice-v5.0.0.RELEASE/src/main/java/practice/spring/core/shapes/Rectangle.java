package practice.spring.core.shapes;

import java.util.List;
import java.util.Set;

import practice.spring.core.shapes.utilities.Point;
import practice.spring.core.shapes.utilities.Shape;

public class Rectangle implements Shape {

	private List<Point> listPoints;
	private Set<Point> setPoints;
	
	@Override
	public String toString() {
		StringBuilder pointString = new StringBuilder(" with coordinates " );
		
		for(Point point:this.getListPoints()) {
			pointString.append("("+point.getX() + "," + point.getY()+ ") ");
		}
		
		pointString.append(" and another rectangle with coordinates ");
		for(Point point:this.getSetPoints()) {
			pointString.append("("+point.getX() + "," + point.getY()+ ") ");
		}
		
		return  pointString.toString();
	}
	
	@Override
	public String draw() {
		return this.toString();
	}

	public Set<Point> getSetPoints() {
		return setPoints;
	}

	public void setSetPoints(Set<Point> setPoint) {
		this.setPoints = setPoint;
	}

	public List<Point> getListPoints() {
		return listPoints;
	}

	public void setListPoints(List<Point> listPoints) {
		this.listPoints = listPoints;
	}

}