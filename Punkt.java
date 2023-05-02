package Standard;

public class Punkt {
	
	private int x;
	private int y;
	
	public Punkt() {
		x = 1;
		y = 1;
	}
	
	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void moveTo(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public void moveTo(Punkt p) {
		setX(p.getX());
		setY(p.getY());
	}
	
	public void move(int dX, int dY) {
		setX(x + dX);
		setY(y + dY);
	}
	
}
