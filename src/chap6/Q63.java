package chap6;

import java.util.*;

public class Q63 {
	public static void main(String[] args) {
		int x = 65;
		Calendar cal = Calendar.getInstance();
		cal.set(2004, 8, 10);
		cal.add(Calendar.DATE, x);
		Date date = cal.getTime();
		System.out.println(date);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int d = cal.get(Calendar.DAY_OF_WEEK);
		if (d == 1) {
			System.out.println(year + "年" + month + "月" + day
					+ "日に振り込めませんので、次の月曜日である");
			day += 1;
			System.out.println(year + "年" + month + "月" + day + "日に振り込みます");
		} else if (d == 7) {
			System.out.println(year + "年" + month + "月" + day
					+ "日に振り込めませんので、次の月曜日である");
			day += 2;
			System.out.println(year + "年" + month + "月" + day + "日に振り込みます");
		} else {
			System.out.println(year + "年" + month + "月" + day + "日に振り込みます");
		}

	}
}
