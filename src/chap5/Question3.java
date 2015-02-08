package chap5;

import java.awt.*;

public class Question3 extends Frame {

	public Question3() {
		super();
		setSize(300, 300);
		setTitle("星を描画");
		setBackground(new Color(255, 255, 255));
		setLocation(0, 0);
		setResizable(false);
		setLayout(null);
		MyCanvas mc = new MyCanvas();
		mc.setBounds(0, 0, 300, 300);
		this.add(mc);
	}

	public static void main(String[] args) {
		Question3 q3 = new Question3();
		q3.setVisible(true);

	}

	class MyCanvas extends Canvas {
		public void paint(Graphics g) {
			g.setColor(Color.ORANGE);
			int[] x = { 100, 124, 195, 138, 159, 100, 42, 63, 6, 77 };
			int[] y = { 30, 98, 99, 141, 210, 169, 210, 141, 99, 98 };
			int z = x.length;
			g.fillPolygon(x, y, z);
		}
	}

}
