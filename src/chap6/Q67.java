package chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q67 {
	public static void main(String[] args) {
		System.out.println("国の名前を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String country = br.readLine();
			switch (country) {
			case "アメリカ合衆国":
				System.out.println("ワシントンD.C.");
				break;
			case "フランス":
				System.out.println("パリ");
				break;
			case "中華人民共和国":
				System.out.println("北京");
				break;
			case "大韓民国":
				System.out.println("ソウル");
				break;
			case "フィリピン":
				System.out.println("マニラ");
				break;
			case "日本":
				System.out.println("東京");
				break;
			default:
				break;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
