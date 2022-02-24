
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 8, 2025);
		Ngay ngay2 = new Ngay(1, 3, 2025);
		Ngay ngay3 = new Ngay(6, 9, 2025);
		
		Quocgia quocGia1 = new Quocgia("VN", "Việt Nam");
		Quocgia quocGia2 = new Quocgia("USA", "Hoa Kỳ");
		Quocgia quocGia3 = new Quocgia("TW", "Đài Loan");
		
		Hangsx hangSanXuat1 = new Hangsx("VNLaptop", quocGia1);
		Hangsx hangSanXuat2 = new Hangsx("Macbook", quocGia2);
		Hangsx hangSanXuat3 = new Hangsx("Asus", quocGia3);
		
		Maytinh mayTinh1 = new Maytinh(hangSanXuat1, ngay1, 1500, 12);
		Maytinh mayTinh2 = new Maytinh(hangSanXuat2, ngay2, 2000, 24);
		Maytinh mayTinh3 = new Maytinh(hangSanXuat3, ngay3, 1000, 12);
		
		System.out.println("So sanh gia thấp hơn: ");
		System.out.println("M1 < M2: "+ mayTinh1.KT(mayTinh2));
		System.out.println("M1 < M3: "+ mayTinh1.KT(mayTinh3));
		
		
		System.out.println("Tên quốc gia: ");
		System.out.println("M1: "+ mayTinh1.Ten());
		System.out.println("M2: "+ mayTinh2.Ten());
		System.out.println("M3: "+ mayTinh3.Ten());
	}
}
