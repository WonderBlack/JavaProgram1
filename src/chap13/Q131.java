package chap13;

import java.awt.Button;
import java.awt.Frame;

public class Q131 extends Frame {

	public Q131() {
		super();
		setSize(300, 300);
		setLayout(null);

		Button b = new Button("Push");
		b.setBounds(100, 100, 100, 100);
		this.add(b);
	}
	
	public static void main(String[] args) {
		Q131 q = new Q131();
		q.setVisible(true);
	}

}
