package bai_tap_lon;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DSSach {
	private ArrayList<Sach> listsach;

	public DSSach(){
	listsach=new ArrayList<Sach>();
}
	public void nhapDS() {
		System.out.println("--------------------------------------------");
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong Sach: ");
		n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			Sach a = new Sach();
			System.out.println("--------------------------------------------");
			a.nhapSach();
			listsach.add(a);
		}
	}
	public void hienDS() {
		for(Sach a:listsach) {
			System.out.println("--------------------------------------------");
			a.hienSach();
		}
	}
	public void timSach(String maSach) {
		boolean kt=false;
		for(Sach t:listsach) {
			if(maSach.compareTo(t.getMaSach())==0) {
				t.hienSach();
				kt=true;
				break;
			}
		}
		if(kt==false)
			System.out.println("Khong tim thay sach.");
}
	public void themSach() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("--------------------------------------------");
			Sach s = new Sach();
			s.nhapSach();
			listsach.add(s);
			System.out.println("ban muon them tiep khong(y/n):");
		}while(sc.nextLine().equalsIgnoreCase("y"));
	}
	public void xoaSach() {
		Scanner sc = new Scanner(System.in);
		String masach;
		do{
			int kt=0;
			System.out.print("hay nhap ma sach can xoa:");
			masach=sc.nextLine();
			for(Sach s:listsach){
				if(masach.compareTo(s.getMaSach())==0) {
					listsach.remove(s);
					System.out.println("xoa thanh cong");
					kt=1;
					break;
				}
			}
			if(kt==0) System.out.println("ma sach ban nhap khong dung");
			System.out.print("ban co muon xoa tiep khong(y/n):");
		}while(sc.nextLine().equalsIgnoreCase("y"));
	}
	public void suaSach() {
		Scanner sc = new Scanner(System.in);
		String masach;
		do{
			int kt=0;
			Sach a= new Sach();
			System.out.println("hay nhap ma sach:");
			masach=sc.nextLine();
			for(Sach s:listsach){
				if(masach.compareTo(s.getMaSach())==0) {
					System.out.print("da thay sach co ma da nhap," +
							" hay nhap thong tin de thay the,");
					a.nhapSach();
					listsach.set(listsach.indexOf(s), a);
					System.out.println("sua thanh cong");
					kt=1;
					break;
				}
			}
			if(kt==0) System.out.println("ma sach ban nhap khong dung hay nhap lai");
			System.out.print("ban co muon sua tiep khong(y/n):");
		}while(sc.nextLine().equalsIgnoreCase("y"));
	}
	public int giaSach(String masach){
		for(Sach t:listsach) {
			if(masach.compareTo(t.getMaSach())==0) {
				return t.getGiaSach();
			}
		}
		return 0;
	}
	public int kTSach(String masach){
		for(Sach t:listsach) {
			if(masach.compareTo(t.getMaSach())==0) {
				return 1;
			}
		}
		return 0;
	}
	public void ghiFile() {
		try {
			FileOutputStream fout = new FileOutputStream("DSSach.bin");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(listsach);
			fout.close();
			oout.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void docFile() {
		try {
			FileInputStream fin = new FileInputStream("DSSach.bin");
			ObjectInputStream oin = new ObjectInputStream(fin);
			listsach= (ArrayList<Sach>) oin.readObject();
			fin.close();
			oin.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}

