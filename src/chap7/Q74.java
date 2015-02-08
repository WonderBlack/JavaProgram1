package chap7;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Q74 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("アメリカ合衆国", "ワシントンD.C.");
		map.put("フランス", "パリ");
		map.put("中華人民共和国", "北京");
		map.put("大韓民国", "ソウル");
		map.put("フィリピン", "マニラ");
		map.put("日本", "東京");
		System.out.println("国の名前を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String country = br.readLine();
				if (map.containsKey(country)) {
					System.out.println(map.get(country));
				} else {
					System.out.println("その国はリストにありません。");
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
