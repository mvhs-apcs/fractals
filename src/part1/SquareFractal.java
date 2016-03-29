package part1;
import java.awt.Color;
import java.awt.geom.Point2D;
import draw.StdDraw;


public class SquareFractal {

	private double shrink = 0.5;
	
	public SquareFractal() {
		StdDraw.setXscale(0, 150); 
		StdDraw.setYscale(0, 150); 
		
		Square square = new Square(new Point2D.Double(75, 75), 80);
		 
		StdDraw.clear(StdDraw.GRAY); 
		fractal(square, 2, Color.WHITE);
		
		StdDraw.show();
	}
	
	
	public void fractal(Square square, int n, Color color) {
		// TODO: modify to produce examples/Square/pic1, pic2, and pic3
		
		if (n <= 0) return;
		
		double newSize = square.getSize()*shrink;
		Square bottomLeft  = new Square(square.getBottomLeft(),  newSize);
		Square topLeft     = new Square(square.getTopLeft(),     newSize);
		Square bottomRight = new Square(square.getBottomRight(), newSize);
		Square topRight    = new Square(square.getTopRight(),    newSize);
		
		int red   = Math.max(0, (int)(color.getRed()-(255*.10)));
		int green = Math.max(0, (int)(color.getGreen()-(255*.10)));
		int blue  = Math.max(0, (int)(color.getBlue()-(255*.10)));
		
		Color nextColor = new Color(red, green, blue);
		
		square.draw(color);
		
		fractal(topLeft,     n-1, nextColor);
		fractal(topRight,    n-1, nextColor);
		fractal(bottomLeft,  n-1, nextColor);
		fractal(bottomRight, n-1, nextColor);
	}
	
	
	public static void main(String[] args) {
		SquareFractal sqF = new SquareFractal();
	}
}
