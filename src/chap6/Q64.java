package chap6;

public class Q64 {
	public static void main(String[] args) {
		double weight = 120;
		double height = 1.78;
		double bmi = weight / (height * height);
		System.out.println(bmi);
		if (bmi <= 18.5) {
			System.out.println("やせています");
		} else if (bmi <= 25) {
			System.out.println("標準です");
		} else if (bmi <= 30) {
			System.out.println("肥満レベル１");
		} else if (bmi <= 35) {
			System.out.println("肥満レベル２");
		} else if (bmi <= 40) {
			System.out.println("肥満レベル３");
		} else {
			System.out.println("肥満レベル４");
		}
	}
}
