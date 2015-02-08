package chap5;

import java.awt.Color;
import java.awt.Frame;

public class Question2 {
	public static void main(String[] args) {
		Frame fr = new Frame();
		fr.setSize(300, 200);
		fr.setTitle("赤いフレーム");
		fr.setBackground(new Color(238, 44, 44));
		fr.setLocation(0, 0);
		fr.setResizable(false);
		fr.setVisible(true);
	}
}
