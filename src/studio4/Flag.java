package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	StdDraw.setPenColor(Color.BLACK);
	StdDraw.setPenRadius(0.01);
	
	StdDraw.rectangle(0.5, 0.5, 0.5, 0.25);
	double[] x = {0, 1, 0.5};
	double[] y = {0.75, 0.75, .25};
	StdDraw.setPenColor(Color.orange);
	StdDraw.filledPolygon(x, y);
	StdDraw.setPenColor(Color.red);
	StdDraw.filledCircle(0.5, .525, .125);
	StdDraw.setPenColor(Color.orange);
	StdDraw.filledCircle(0.5, 0.5, .1);
	StdDraw.setPenColor(Color.white);
	double[] x2 = {0, 1, 0.5};
	double[] y2 = {0.25, 0.25, .5};
	StdDraw.filledPolygon(x2, y2);
	StdDraw.setPenColor(48,108,94);
	double[] x3 = {0, 1, 0.5};
	double[] y3 = {0.25, 0.25, .45};
	StdDraw.filledPolygon(x3, y3);
		
	}
}