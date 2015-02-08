package chap9;

public class CellularPhone_4 {
	private String number;
	private String name;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
