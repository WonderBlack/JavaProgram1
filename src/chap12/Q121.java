package chap12;

import java.awt.*;
import java.awt.event.*;

class Q121 extends WindowAdapter implements ActionListener {
	Frame frm;
	int x = 200;
	int y = 200;

	public static void main(String args[]) {
		Q121 win = new Q121();
		win.start();
	}

	private void start() {
		frm = new Frame("file on your lap");
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
			System.exit(1);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(1);
	}

	private static void createNewFrame(int width, int height) {
		Q121 cf = new Q121();
		cf.x = width;
		cf.y = height;
		cf. start();

	}
	
}
