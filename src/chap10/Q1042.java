package chap10;

import java.awt.Image;
import java.awt.Toolkit;

public class Q1042 {
	public static void main( String [] args )
	{
		CellularPhoneWithCamera_1 cpwc = new CellularPhoneWithCamera_1();

		cpwc.setNumber( "090-1234-5678" );
		cpwc.setName( "神奈川太郎" );
		Image image = Toolkit.getDefaultToolkit().getImage( "test.jpg" );
		cpwc.setImage( image );
	}
}