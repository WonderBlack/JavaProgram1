package chap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q65 {
	public static void main(String[] args) {
		
		try {
			System.out.println("年を入力してください。");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			int year = Integer.parseInt(line);
			System.out.println("月を入力してください。");
			line = br.readLine();
			int month = Integer.parseInt(line);
			System.out.println(month);
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH, month - 1);
			int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.println(days);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
