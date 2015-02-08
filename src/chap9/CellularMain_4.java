package chap9;

public class CellularMain_4 {
	public static void main(String[] args) {
		CellularPhone_4 cp4 = new CellularPhone_4();
		cp4.setNumber("080-2222-3333");
		cp4.setName("桃太郎");
		System.out.println(cp4.getNumber());
		System.out.println(cp4.getName());
		
		CellularPhone_4 cp42 = new CellularPhone_4();
		cp42.setNumber("080-9999-1111");
		cp42.setName("浦島太郎");
		System.out.println(cp42.getNumber());
		System.out.println(cp42.getName());

	}

}
