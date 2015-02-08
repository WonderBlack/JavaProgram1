package chap10;

import java.awt.Image;

public class CellularPhoneWithCamera_3 extends CellularPhone_11 {
	private Image image;
	private static String companyName;

	public CellularPhoneWithCamera_3(String 電話番号, String 所有者, Image 画像ファイル) {
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
	
	public static void setCompanyName(String cn) {
		companyName = cn;
	}
	
	public static String getCompanyName() {
		return companyName;
	}
}
