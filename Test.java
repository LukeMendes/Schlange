package Standard;

import java.awt.Color;

import bbwn.utils.IODraw;

public class Test {

	public static void main(String[] args) {
		
		Schlange s = new Schlange();
		s.moveCommpletly(100, 100);
		
		for (int i = 0; i < 2000; i++) {
			IODraw.setBackgroundColor(new Color(97,55,13));
			s.move(5, 3);
			s.draw();
			IODraw.delay(50);
			s.prüfeAufKollisionMitRand(500, 500);
		}
	}

}
