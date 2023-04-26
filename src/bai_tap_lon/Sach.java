package bai_tap_lon;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Sach implements Serializable {
	private String tenSach;
	private String maSach;
	private String tacgia;
	private int giaSach;
	private String ngayxuatban;
	private String theloai;
	private String vitrisach;
	public String getMaSach() {
	return maSach;
}
	public int getGiaSach() {
	return giaSach;
}

	public void nhapSach() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin Sach: ");
		System.out.print("Ten Sach: ");
		this.tenSach=sc.nextLine();
		System.out.print("Ma Sach: ");
		this.maSach=sc.nextLine();
		System.out.print("Tac Gia: ");
		this.tacgia=sc.nextLine();
		System.out.print("Gia Sach: ");
		try {
			this.giaSach = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.print("Ngay xuat ban: ");
		this.ngayxuatban=sc.nextLine();
		System.out.print("The Loai: ");
		this.theloai=sc.nextLine();
    	System.out.print("Vi tri sach: ");
		this.vitrisach=sc.nextLine();

	}
	public void hienSach() {
		System.out.println("Ma Sach: "+this.maSach);
		System.out.println("Ten Sach: "+this.tenSach);
		System.out.println("Tac Gia: "+this.tacgia);
		System.out.println("Gia Sach: "+this.giaSach);
		System.out.println("Ngay xuat ban: "+this.ngayxuatban);
		System.out.println("The loai: "+this.theloai);
		System.out.println("Vi tri sach: "+this.vitrisach);
	}
}