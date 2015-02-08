package chap12;

import java.awt.*;
import java.awt.event.*;

class Q122 extends WindowAdapter implements ActionListener {
	Frame frm;
	int x = 200;
	int y = 200;
	static int c = 0;

	public static void main(String args[]) {
		Q122 cf1 = new Q122();
		c++;
		cf1.start();
	}

	private void start() {
		frm = new Frame("フレーム");
		frm.setSize(x, y);
		frm.setVisible(true);
		frm.addWindowListener(this);

		MenuBar mb = new MenuBar();
		Menu file = mb.add(new Menu("ファイル"));

		MenuItem nf100 = file.add(new MenuItem("新しいフレームの作成(100×100)"));
		MenuItem nf200 = file.add(new MenuItem("新しいフレームの作成(200×100)"));
		MenuItem close = file.add(new MenuItem("プログラムの終了"));

		nf100.addActionListener(this);
		nf200.addActionListener(this);
		close.addActionListener(this);

		frm.setMenuBar(mb);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "新しいフレームの作成(100×100)")
			createNewFrame(100, 100);
		if (e.getActionCommand() == "新しいフレームの作成(200×100)")
			createNewFrame(200, 100);
		if (e.getActionCommand() == "プログラムの終了")
			if (c > 1) {
				frm.dispose();
				c--;
			} else {
				System.exit(1);
			}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(1);
	}

	private static void createNewFrame(int width, int height) {
		Q122 cf2 = new Q122();
		c++;
		cf2.x = width;
		cf2.y = height;
		cf2.start();

	}

}
