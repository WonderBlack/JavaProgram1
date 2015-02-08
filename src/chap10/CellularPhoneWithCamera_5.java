package chap10;

import java.awt.Image;

public class CellularPhoneWithCamera_5 extends CellularPhone_11 {
	private Image image;

	public CellularPhoneWithCamera_5(String 電話番号, String 所有者, Image 画像ファイル) {
		super(電話番号, 所有者);
		this.image = 画像ファイル;
	}

	public void setPhoneNumber(String 電話番号) {
		if (!電話番号.startsWith("090")) {
			super.setNumber("***-***-***");
		}
	}

	// 画像ファイルをセットする
	public void setImage(Image img) {
		this.image = img;
	}

	// 画像ファイルを取り出す
	public Image getImage() {
		return image;
	}
}

class Company {

	private static String companyName;
	private static String presidentName;
	private static String tell;
	private static String address;
	
	public Company() {
		
	}

	public static String getCompanyName() {
		return companyName;
	}

	public static String getPresidentName() {
		return presidentName;
	}

	public static String getTell() {
		return tell;
	}

	public static String getAddress() {
		return address;
	}

	public static void setCompanyName(String companyName) {
		Company.companyName = companyName;
	}

	public static void setPresidentName(String presidentName) {
		Company.presidentName = presidentName;
	}

	public static void setTell(String tell) {
		Company.tell = tell;
	}

	public static void setAddress(String address) {
		Company.address = address;
	}

}
