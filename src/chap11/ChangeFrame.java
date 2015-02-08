package chap11;

import java.awt.*;
import java.awt.event.*;

class ChangeFrame extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	boolean flag = true;

	public static void main(String[] args) {
		ChangeFrame cf = new ChangeFrame();

		cf.setSize(150, 150);
		cf.setVisible(true);
	}

	private ChangeFrame() {
		ColorChangeListener ccl = new ColorChangeListener();

		addWindowListener(ccl);
	}

	public void paint(Graphics g) {
		if (flag) {
			g.setColor(Color.red);
		} else {
			g.setColor(Color.blue);
		}
		g.fillOval(30, 30, 100, 100);
	}

	class ColorChangeListener extends WindowAdapter {
		public void windowDeiconified(WindowEvent e) {
			if (flag) {
				flag = false;// フラグがtrueならfalseにする
			} else {
				flag = true;// フラグがfalseならtrueにする
			}
		}
	}
}