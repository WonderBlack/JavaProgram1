package chap7;

import java.awt.*;

class Q73 extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int B = 0;

	public void paint(Graphics g) {
		setLayout(null);
		int y = 0;
		for (int i = 0; i < 255; i++) {
			int x = 0;
			for (int j = 0; j < 255; j++) {

				Color c = new Color(j, i, B);
				g.setColor(c);
				g.fillRect(x, y, 5, 5);
				x += 5;
			}
			y += 5;
		}

	}

	public static void main(String[] args) {
		Q73 bc = new Q73();
		bc.setSize(1275, 1275);
		bc.setVisible(true);
	}
}