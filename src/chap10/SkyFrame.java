package chap10;

import java.awt.*;

class SkyFrame extends Frame {
	public void paint(Graphics g) {
		setBackground(Color.cyan);
		g.setColor(Color.white);
		g.fillOval(20, 35, 30, 10);
		g.fillOval(50, 45, 30, 10);
		g.fillOval(70, 40, 30, 10);
		g.fillOval(110, 35, 30, 10);
	}
}

class Main {
	public static void main(String[] args) {
		SkyFrame s = new SkyFrame();

		s.setSize(150, 150);
		s.setVisible(true);
	}
}
