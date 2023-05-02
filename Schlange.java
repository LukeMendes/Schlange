package Standard;

public class Schlange extends Kreis {
	
	private int Radius;
	private Kreis[] kreise = new Kreis[150];
	private int richtung [] = {1, 1}; 
	private String info;
	
	public Schlange() {
		super();
		for(int i = 0; i < kreise.length; i++) {
			kreise[i] = new Kreis();
		}
		Radius = 30;
		
		kreise[0].setRadius(30);
		
		for(int i = 1; i < kreise.length; i++) {
			int r = (int)(Radius - Radius * ((double) i / (kreise.length - 1)));
			kreise[i].setRadius(r);
		}
	}
	
	public void moveTo(int x, int y) {
		kreise[0].moveTo(x, y);
	}
	
	public void moveTo(Punkt p) {
		kreise[0].moveTo(p);
	}
	
	public void move(int dX, int dY) {
		dX *= richtung[0];
		dY *= richtung[1];
		kreise[0].move(dX, dY);
		
		for(int i = kreise.length-1; i > 0; i--) {
			kreise[i].moveTo(kreise[i-1].getMittelpunkt());
		}
	}
	
	public void moveCommpletly(int x, int y) {
		for(int i = 0; i < kreise.length; i++) {
			kreise[i].moveTo(x, y);
		}
	}
	
	public void draw() {
		for(int i = 0; i < kreise.length; i++) {
			kreise[i].draw();
		}
	}
	
	public void prüfeAufKollisionMitRand(int width, int height) {
		int x = kreise[0].getMittelpunkt().getX();
		int y = kreise[0].getMittelpunkt().getY();
		
		int abstand = 0;
		
		if(richtung[1] > 0) {
			abstand = height - (y + Radius);
			if(abstand < 0) {
				//y = Radius;
				richtung[1] *= (-1);
				info = info();
			}
		}
		
		if(richtung[1] < 0) {
			abstand = y - Radius;
			if(abstand < 0) {
				//abstand = y - Radius;
				richtung[1] *= (-1);
				info = info();
			}
		}
		if(richtung[0] < 0) {
			abstand = x - Radius;
			if(abstand < 0) {
				//x = Radius;
				richtung[0] *= (-1);
				info = info();
			}
		}
		
		if(richtung[0] > 0) {
			abstand = width - (x + Radius);
			if(abstand < 0) {
				//x = Radius;
				richtung[0] *= (-1);
				info = info();
			}
		}
	}
	
	public String info() {
		return "Richtung geändert";
	}
}
