import java.util.Scanner;

public class Hello{
	private int ngay,thang,nam;
	public Hello(int d, int m, int y) {
		this.ngay = d;
		this.thang = m;
		this.nam = y;
	}
	public void printday() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}
}
