package chap6;

import java.util.*;

public class Q61 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);
		int d = cal.get(Calendar.DAY_OF_WEEK);
		switch (d) {
		case 1:
			System.out.println("日曜日");
			break;
//		case 2:
//			System.out.println("月曜日");
//			break;
//		case 3:
//			System.out.println("火曜日");
//			break;
//		case 4:
//			System.out.println("水曜日");
//			break;
//		case 5:
//			System.out.println("木曜日");
//			break;
//		case 6:
//			System.out.println("金曜日");
//			break;
		case 7:
			System.out.println("土曜日");
			break;
		default:
			System.out.println("平日");
			break;
		}
	}
}
