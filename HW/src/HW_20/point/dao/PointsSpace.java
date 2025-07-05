package HW_20.point.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

import HW_20.point.model.Point;

public class PointsSpace {
	Point relPoint;
	Point[] points;
	Comparator<Point> comp;

	public PointsSpace(Point relPoint, Point[] points) {
		this.relPoint = relPoint;
		//FIXME Fix problem
		//TODO sorting this.points by proximity to relPoint (ask to Pithagoras)
		//to apply method sort of class Arrays
		Point[] dist = new Point[points.length];

		comp = (d1, d2) -> Double.compare(Math.sqrt(Math.pow(d1.getX()-relPoint.getX() ,2)
				+(Math.pow( d1.getY()-relPoint.getY() ,2))
        ), Math.sqrt(Math.pow(
				d2.getX()-relPoint.getX(),2)+(Math.pow( d2.getY()-relPoint.getY() ,2))));
		Arrays.sort(points,comp);
		this.points = points;

	}

	public Point[] getPoints() {
		return points;
	}
	
	public void addPoint(Point point) {
		Arrays.sort(points,comp);

		//TODO keep sort of this.points
		//to apply method binarySearch of the class Arrays
		//to apply method arrayCopy of the class System
		//method arrayCopy will be called twice
	}
}
