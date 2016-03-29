package part3;
import java.awt.geom.Point2D;
import draw.StdDraw;


public class H {

	private Point2D.Double[] points = new Point2D.Double[6];
	private double size;
	
	public H(Point2D.Double center, double size) {
		this.size = size;
		double radius = size/2;
		points[0] = new Point2D.Double(center.x-radius, center.y-radius);
		points[1] = new Point2D.Double(center.x+radius, center.y-radius);
		points[2] = new Point2D.Double(center.x+radius, center.y+radius);
		points[3] = new Point2D.Double(center.x-radius, center.y+radius);
		points[4] = new Point2D.Double(center.x-radius, center.y);
		points[5] = new Point2D.Double(center.x+radius, center.y);
	}
	
	public void draw() {
		StdDraw.line(points[0].x, points[0].y, points[3].x, points[3].y);
		StdDraw.line(points[1].x, points[1].y, points[2].x, points[2].y);
		StdDraw.line(points[4].x, points[4].y, points[5].x, points[5].y);
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
