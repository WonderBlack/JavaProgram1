package chap7;

public class Q72 {
	public static void main(String[] args) {
		double[] x = { 12.3, 45.4, 45.9, 3.56, 6.6, 8.9, 2.3, 0.5, 4.3, 1.2 };
		double max = x[0];
		double min = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
			if (x[i] < min) {
				min = x[i];
			}
		}
		System.out.println("最大値は" + max);
		System.out.println("最小値は" + min);
	}

}
