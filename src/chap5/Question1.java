package chap5;

import java.awt.Color;
import java.awt.Frame;

public class Question1 {
	public static void main(String[] args) {
		Frame fr = new Frame();
		fr.setSize(300, 200);
		fr.setTitle("赤いフレーム");
		fr.setBackground(new Color(238, 44, 44));
		fr.setLocation(0, 0);
		fr.setVisible(true);

		Frame fr2 = new Frame();
		fr2.setSize(300, 200);
		fr2.setTitle("青いフレーム");
		fr2.setBackground(new Color(58, 95, 205));
		fr2.setLocation(200, 200);
		fr2.setVisible(true);

		Frame fr3 = new Frame();
		fr3.setSize(300, 200);
		fr3.setTitle("緑のフレーム");
		fr3.setBackground(new Color(34, 139, 34));
		fr3.setLocation(400, 400);
		fr3.setVisible(true);
	}
}
