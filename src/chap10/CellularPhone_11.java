package chap10;

public class CellularPhone_11 {

	private String number;
	private String name;

	public CellularPhone_11() {

	}

	public CellularPhone_11(String 電話番号, String 所有者) {
		number = 電話番号;
		name = 所有者;
	}

	public CellularPhone_11(String 市外局番, String 市内局番, String 加入者番号) {
		number = 市外局番 + "-" + 市内局番 + "-" + 加入者番号;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	void setPhoneNumber(String 市外局番, String 市内局番, String 加入者番号) {
		this.number = 市外局番 + "-" + 市内局番 + "-" + 加入者番号;
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
