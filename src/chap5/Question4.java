package chap5;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

import chap5.Question4;

class Question4 extends Frame {
	public void paint(Graphics g) {
		// Color c = new Color(0, 0, 255);
		g.setColor(Color.blue);
		Font f = new Font("Verdana", Font.ITALIC | Font.BOLD, 30);
		g.setFont(f);
		g.drawString("ATHENS 2004 Olympic Games", 50, 50);
	}

	public static void main(String[] args) {
		Question4 sf = new Question4();

		sf.setSize(1000, 100);
		sf.setTitle("ポスター");
		sf.setVisible(true);
	}
}
