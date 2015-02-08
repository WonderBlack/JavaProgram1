package chap4;

public class Question2 {
	public static void main(String[] args) {
		int money = 126457;
		int man = money / 10000;
		int nokori = money % 10000;
		int gosen = nokori / 5000;
		nokori = nokori % 5000;
		int nisen = nokori / 2000;
		nokori = nokori % 2000;
		int sen = nokori / 1000;
		nokori = nokori % 1000;
		int gohyaku = nokori / 500;
		nokori = nokori % 500;
		int hyaku = nokori / 100;
		nokori = nokori % 100;
		int gozyuu = nokori / 50;
		nokori = nokori % 50;
		int zyuu = nokori / 10;
		nokori = nokori % 10;
		int go = nokori / 5;
		nokori = nokori % 5;
		int ichi = nokori / 1;

		System.out.println(money + "円は、");
		System.out.println("1万円札が" + man + "枚,");
		System.out.println("五千円札が" + gosen + "枚,");
		System.out.println("二千円札が" + nisen + "枚,");
		System.out.println("一千円札が" + sen + "枚,");
		System.out.println("五百円玉が" + gohyaku + "枚,");
		System.out.println("百円が" + hyaku + "枚,");
		System.out.println("五十円玉が" + gozyuu + "枚");
		System.out.println("十円玉が" + zyuu + "枚,");
		System.out.println("五円玉が" + go + "枚,");
		System.out.println("一円玉が" + ichi + "枚,");
	}

}
