package chap10;

import java.awt.Image;

public class CellularPhoneWithCamera_2 extends CellularPhone_11 {
	private Image image;

	public CellularPhoneWithCamera_2(String 電話番号, String 所有者, Image 画像ファイル) {
		super(電話番号, 所有者);
		this.image = 画像ファイル;
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
