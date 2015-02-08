package chap9;

public class CellularPhone_5 {
	private String number;
	private String name;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void print() {
		System.out.println(this.number);
		System.out.println(this.name);
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
