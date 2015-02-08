package chap10;

import java.awt.*;
import java.util.Random;
import javax.naming.InterruptedNamingException;

class Q107 extends SkyFrame {
	public void paint(Graphics g) {
		super.paint(g);
		// 草原を描く
		this.grass(g);
		// 花を描く
		for (int i = 0; i < 300; i++) {
			this.flower(g);
		}
	}

	public void grass(Graphics g) {
		int R = 0;
		int G = 0;
		int B = 0;
		for (int i = 145; i > 65; i -= 5) {
			G = 255;
			Color c = new Color(R, G, B);
			g.setColor(c);
			g.fillRect(0, i, 150, 5);
			R += 15;
			B += 15;
		}
	}

	private void flower(Graphics g) {
		Random rnd = new Random();
		int R = 255;
		int G = 255;
		int B = 0;
		int width = 7;
		int height = 7;
		int x = rnd.nextInt(150);
		int y = 140; // 140~70
		System.out.println(y);
		int ran = rnd.nextInt(70);
		y = y - ran;
		System.out.println(y);
		if (y <= 90) {
			width = 2;
			height = 2;
			B = 150;
		} else if (y <= 110) {
			width = 3;
			height = 3;
			B = 120;
		} else if (y <= 120) {
			width = 4;
			height = 4;
			B = 90;
		} else if (y <= 130) {
			width = 5;
			height = 5;
			B = 50;
		}
		Color myColor = new Color(R, G, B);
		g.setColor(myColor);
		g.fillOval(x, y, width, height);
	}

	public static void main(String[] args) {
		Q107 sf = new Q107();

		sf.setSize(150, 150);
		sf.setTitle("グラフィック");
		sf.setVisible(true);
	}
}
