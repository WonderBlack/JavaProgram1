package chap11;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MovingBallFrame extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x;
	int y;

	public static void main(String[] args) {
		MovingBallFrame mbf = new MovingBallFrame();
		mbf.setSize(400, 400);
		mbf.setBackground(Color.white);
		mbf.setVisible(true);
	}

	public MovingBallFrame() {
		MouseDragListener mdl = new MouseDragListener();
		addMouseMotionListener(mdl);
	}

	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x, y, 20, 20);
	}

	class MouseDragListener extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();
		}
	}

}
