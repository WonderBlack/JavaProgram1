package chap8;

public class CellularPhone_3 {
	String number;
	String name;

	void print() {
		System.out.println(number);
		System.out.println(name);
	}

	int getPhoneKind(String pn) {
		if (pn.startsWith("090")) {
			return 0;
		} else if (pn.startsWith("070")) {
			return 1;
		} else {
			return 2;
		}
	}
}
