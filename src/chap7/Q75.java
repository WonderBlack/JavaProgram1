package chap7;

import java.io.*;

public class Q75 {
	public static void main(String args[]) {
		String FileName = "/Users/kamishimakaname/Desktop/input.dat"; // 表示するファイル
		String line; // 読み込んだ行を格納
		String st = ""; // 行を集積した文を格納
		try {
			BufferedReader bf = new BufferedReader(new FileReader(FileName));
			while ((line = bf.readLine()) != null) {
				st += (line + "\n");
			}
		} catch (IOException e) {
			System.out.println("表示中にエラー発生");
		}
		System.out.println(st);
		st = st.replaceAll(",", "\t\t");
		System.out.println(st);
	}
}