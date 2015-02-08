package chap7;

import java.io.*;
import java.util.*;

class Q76 {
	public static void main(String[] args) {
		int n = 1; // 入力データの行数
		String line = null; // 入力された行
		try {
			FileReader fr = new FileReader("/Users/kamishimakaname/Desktop/input.dat");
			BufferedReader br = new BufferedReader(fr);

			String key = null; // 県名を保持して、比較に利用する
			int sum = 0; // 人口の総数を保持

			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, ",");

				String 県の名前 = st.nextToken();
				String 市の名前 = st.nextToken();
				int value = Integer.parseInt(st.nextToken());

				if (n != 1) // 最初のデータでなければ(最初のデータは何もしない)
				{
					if (!key.equals(県の名前)) // ブレイクした
					{
						System.out.println("　　　合計：" + sum);
						sum = 0;
						key = 県の名前;
					}
				} else {
					key = 県の名前; // 最初のデータなのでキーに県名をセットする
				}
				System.out.println(県の名前 + "\t" + 市の名前 + "\t" + value);
				sum += value;
				n++;
			}
			System.out.println("　　　合計：" + sum);
		} catch (FileNotFoundException e) {
			System.out.println("入力ファイル「input.dat」が無い");
		} catch (IOException e) {
			System.out.println("ファイル入力中にエラー発生");
		} catch (NoSuchElementException e) {
			System.out.println("\nError " + n + "行目：" + line + "\nデータの項目が足りない");
		} catch (NumberFormatException e) {
			System.out.println("\nError " + n + "行目：" + line + "\n数値定数に誤りがある");
		}
	}
}