package chap7;

public class Q71 {
	public static void main(String[] args) {
		double[] x = { 12.3, 45.4, 45.9, 3.56, 6.6, 8.9, 2.3, 0.5, 4.3, 1.2 };
		double y = 0;
		for (int i = 0; i < x.length; i++) {
			y += x[i];
			System.out.println(y);
		}
		System.out.println("合計は" + y);
		System.out.println("平均は" + (y / x.length));
	}

}
