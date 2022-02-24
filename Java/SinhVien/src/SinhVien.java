
public class SinhVien {
	private String MSSV, HoTen;
	private Lop l;
	private Ngay ng;
	private double DTB;
	public SinhVien(String mSSV, String hoTen, Lop l, Ngay ng, double dTB) {
		MSSV = mSSV;
		HoTen = hoTen;
		this.l = l;
		this.ng = ng;
		DTB = dTB;
	}
	
	public String Tenkhoa() {
		return l.getTenkhoa();
	}
	
	public boolean Dau() {
		if(this.DTB >= 5.0) return true;
		else return false;
	}
	public boolean KT(SinhVien s) {
		return this.equals(s);
	}
}
