package chap10;

import java.awt.Image;

public class CellularPhoneWithCamera_1 extends CellularPhone_9 {
	
	private Image image;
	
	// 画像ファイルをセットする
	public void setImage(Image img) {
		this.image = img;
	}

	// 画像ファイルを取り出す
	public Image getImage() {
		return image;
	}
}
