
public class Maytinh {
	private Hangsx hsx;
	private Ngay ng;
	private double gia;
	private double tgbh;
	
	public Maytinh(Hangsx hsx, Ngay ng, double gia, int tgbh) {
		super();
		this.hsx = hsx;
		this.ng = ng;
		this.gia = gia;
		this.tgbh = tgbh;
	}
	public Hangsx getHsx() {
		return hsx;
	}
	public void setHsx(Hangsx hsx) {
		this.hsx = hsx;
	}
	public Ngay getNg() {
		return ng;
	}
	public void setNg(Ngay ng) {
		this.ng = ng;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public double getTgbh() {
		return tgbh;
	}
	public void setTgbh(int tgbh) {
		this.tgbh = tgbh;
	}
	
	public boolean KT(Maytinh mt) {
		return this.gia < mt.gia;
	}
	
	public String Ten() {
		return this.hsx.getQg().getTenQG();
	}
}
