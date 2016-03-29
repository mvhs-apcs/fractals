package part1;
import java.awt.Color;
import java.awt.geom.Point2D;

import draw.StdDraw;


public class Square {

	private Point2D.Double[] points = new Point2D.Double[4];
	private double size;
	
	public Square(Point2D.Double center, double size) {
		this.size = size;
		double radius = size/2;
		points[0] = new Point2D.Double(center.x-radius, center.y-radius);
		points[1] = new Point2D.Double(center.x+radius, center.y-radius);
		points[2] = new Point2D.Double(center.x+radius, center.y+radius);
		points[3] = new Point2D.Double(center.x-radius, center.y+radius);
	}
	
	public void draw(Color color) {
		double[] x = {points[0].x, points[1].x, points[2].x, points[3].x};
		double[] y = {points[0].y, points[1].y, points[2].y, points[3].y};
		StdDraw.setPenColor(color);
		StdDraw.filledPolygon(x,y);
	}
	
	public Point2D.Double getTopLeft() {
		return points[3];
	}
	
	public Point2D.Double getTopRight() {
		return points[2];
	}
	
	public Point2D.Double getBottomRight() {
		return points[1];
	}
	
	public Point2D.Double getBottomLeft() {
		return points[0];
	}
	
	public double getSize() {
		return size;
	}
}
