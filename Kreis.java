package Standard;

import java.awt.Color;
import java.awt.color.ICC_ProfileRGB;
import java.awt.image.RGBImageFilter;

import org.w3c.dom.css.RGBColor;

import bbwn.utils.IODraw;

public class Kreis extends Punkt {
	
	private int radius;
	private Punkt mittelpunkt;
	
	public Kreis() {
		super();
		radius = 10;
		mittelpunkt = new Punkt(1, 1);
	}
	
	public Kreis(int radius, int x, int y) {
		super(x, y);
		this.radius = radius;
		mittelpunkt = new Punkt(x, y);
	}
	
	public Kreis(int radius, Punkt p) {
		super();
		this.radius = radius;
		mittelpunkt = p;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Punkt getMittelpunkt() {
		return mittelpunkt;
	}

	public void setMittelpunkt(Punkt mittelpunkt) {
		this.mittelpunkt = mittelpunkt;
	}
	
	public void moveTo(int x, int y) {
		mittelpunkt.moveTo(x, y);
	}
	
	public void moveTo(Punkt p) {
		mittelpunkt.moveTo(p);
	}
	
	public void move(int dX, int dY) {
		mittelpunkt.move(dX, dY);
	}
	
	public void draw() {
		IODraw.setColor(new Color(72,146,41));
		IODraw.fillCircle(mittelpunkt.getX(), mittelpunkt.getY(), radius);
	}
	
}
