package chap6;

public class Q62 {
	public static void main(String[] args) {
		int eng = 90;
		int math = 80;
		int lan = 69;

		if (eng >= 60 && math >= 60 && lan >= 60) {
			String str = "合格：";
			if ((eng + math) >= 160 && (eng + lan) >= 160) {
				str += "理系合格,文系合格";
			} else if ((eng + math) >= 160) {
				str += "理系合格";
			}
			else if ((eng + lan) >= 160) {
				str += "文系合格";
			} else {
				str += "一般合格";
			}
			System.out.println(str);
		} else {
			System.out.println("不合格：各科目は60点以上でなければならない。");
		}
	}
}
