package chap13;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q132 extends Frame {
	static String s = "Push";
	Label l;
	
	public Q132() {
		super();
		setSize(300, 300);
		setLayout(null);

		l = new Label("");
		l.setBounds(100, 50, 200, 50);
		this.add(l);

		Button b = new Button(s);
		b.setBounds(100, 100, 100, 100);
		this.add(b);
		
		b.addActionListener(new ClickAction());
	}

	public static void main(String[] args) {
		Q132 q = new Q132();
		q.setVisible(true);
	}

	class ClickAction implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			l.setText("クリックされました");

		}
	}

}
