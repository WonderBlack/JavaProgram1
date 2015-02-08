package chap4;

public class Question3 {
	public static void main(String[] args) {

		double R = 6.37 * (10 * 10 * 10 * 10 * 10 * 10);
		double r = 60.1 * R;
		double g = 9.80;

		double a = 2 * Math.PI;
		double c = r * r * r;
		double d = g * (R * R);
		double e = c / d;
		double f = Math.sqrt(e);
		double T = a * f;

		System.out.println(T);
	}

}
