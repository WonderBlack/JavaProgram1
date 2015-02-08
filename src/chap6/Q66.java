package chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q66 {
	public static void main(String[] args) {
		int id;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(125, 10);
		map.put(166, 10);
		map.put(168, 10);
		map.put(173, 10);
		map.put(164, 5);
		map.put(172, 5);
		map.put(192, 5);

		System.out.println("学生番号をどうぞ>>>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = br.readLine();
			id = Integer.parseInt(line);
			if (map.containsKey(id)) {
				System.out.println(map.get(id));
			} else {
				System.out.println(2);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
