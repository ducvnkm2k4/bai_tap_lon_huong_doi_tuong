package bai_tap_lon;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class PhieuMuon implements Serializable {
	private String maPhieumuon;
	private String ngayMuon;
	private String hanTra;
	private String mathuthu="";
	private String mabandoc;
	private ArrayList<String> listmasach;
	private String trangthai;

	public PhieuMuon() {
		listmasach = new ArrayList<String>();
	}

	public String getMaPhieumuon() {
		return maPhieumuon;
	}

	public String getTrangthai() {
		return trangthai;
	}

	public void nhapPhieuMuon(DSSach c ,DanhSach ds ) {
		Scanner sc = new Scanner(System.in);
		int slsach;
		System.out.println("Nhap thong tin Phieu Muon: ");
		System.out.print("ma phieu muon:");
		this.maPhieumuon= sc.nextLine();
		System.out.print("Ngay Muon: ");
		this.ngayMuon=sc.nextLine();
		System.out.print("Han Tra: ");
		this.hanTra=sc.nextLine();
		//nhập mã sách
		do {
			String mathuthu;
			System.out.print("Ma thu thu:");
			mathuthu = sc.nextLine();
			if (ds.kTThuThu(mathuthu) == 1) {
				this.mathuthu=mathuthu;
				break;
			}
			else {
				if(mathuthu.compareTo("*")==0) break;
				System.out.println("khong co nhan vien tren hay nhap lai");
			}
		} while (true);
		//nhập mã bạn đọc
		do {
			String mabandoc;
			System.out.print("Ma ban doc:");
			mabandoc = sc.nextLine();
			if (ds.kTBanDoc(mabandoc) == 1) {
				this.mabandoc=mabandoc;
				break;
			}
			else {
				if(mabandoc.compareTo("*")==0) break;
				System.out.println("khong co ban doc tren hay nhap lai");
			}
		} while (true);
		//nhập mã sách
		System.out.print("so luong sach can muon:");
		slsach= Integer.parseInt(sc.nextLine());
		for(int i=0 ; i < slsach ; i++){
			do{
				String masach;
				System.out.print("ma sach:");
				masach=sc.nextLine();
				if(c.kTSach(masach)==1) {
					listmasach.add(masach);
					break;
				}
				else {
					if(masach.compareTo("*")==0) break;
					System.out.println("khong co ma sach da nhap");
				}
			}while(true);
		}
		System.out.print("trang thai phieu:");
		this.trangthai=sc.nextLine();
	}
	public void hienPhieuMuon(DSSach c ,DanhSach ds ) {
		System.out.println("Ma Phieu Muon: "+this.maPhieumuon);
		System.out.println("Ngay Muon: "+this.ngayMuon);
		System.out.println("Han Tra: "+this.hanTra);
		System.out.println("**********************");
		ds.timThuThu(this.mathuthu);
		System.out.println("**********************");
		ds.timBanDoc(this.mabandoc);
		System.out.println("**********************");
		System.out.println("cac sach da muon la:");
		for(String s:listmasach){
			System.out.println("-------------------------");
			c.timSach(s);
		}
		System.out.println("**********************");
		System.out.println("tien phai coc la:"+ tinhTienCoc(c));
		System.out.println("trang thai phieu:"+this.trangthai);
	}
	public double tinhTienCoc(DSSach c){
		double tong=0;
		for(String s:listmasach){
			tong+=c.giaSach(s);
		}
		return 0.1*tong;
	}
}
