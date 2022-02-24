
public class Sach {
	private String tens;
	private double gia;
	private int nmsx;
	private Tacgia tg;
	public Sach(String tens, double gia, int nmsx, Tacgia tg) {
		this.tens = tens;
		this.gia = gia;
		this.nmsx = nmsx;
		this.tg = tg;
	}
	public String getTens() {
		return tens;
	}
	public void setTens(String tens) {
		this.tens = tens;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public int getNmsx() {
		return nmsx;
	}
	public void setNmsx(int nmsx) {
		this.nmsx = nmsx;
	}
	public Tacgia getTg() {
		return tg;
	}
	public void setTg(Tacgia tg) {
		this.tg = tg;
	}
	public void Intensach(){
		System.out.println("Ten sach: " + this.tens);
	}
	
	public boolean KTnam (Sach x) {
		if(this.nmsx == x.nmsx) return true;
		else return false;
	}
	
	public double Giasaukhigiam(double x){
		return(1 - x/100)*this.gia;
	}
	
}
