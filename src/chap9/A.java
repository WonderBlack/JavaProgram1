package chap9;

import java.util.*;

class A {
	public int x;
}

class A_Main {
	public static void main(String[] args) {
		A a = new A();
		Random random = new Random();

		for (int k = 0; k < 100000; k++) {
			a.x = random.nextInt(500);
			System.out.println(a.x);
			if (a.x == 345) {
				System.out.println("345を検出しました。");
				break;
			}
		}

	}
}
