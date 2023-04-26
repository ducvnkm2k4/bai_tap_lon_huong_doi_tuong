package bai_tap_lon;
import java.util.Scanner;

public class Main {
   public static void quanLyPhieuMuon(){
        System.out.println("=====================QUAN LY MUON TRA SACH====================");
        System.out.println("0.thoat");
        System.out.println("1.them phieu muon");
        System.out.println("2.hien danh sach phieu muon");
        System.out.println("3.sua thong tin phieu muon");
        System.out.println("4.xoa phieu muon");
        System.out.println("5.tim phieu muon");
        System.out.println("6.sap xep danh sach phieu muon theo trang thai phieu");
        System.out.println("7.sap xep danh sach phieu muon theo tien coc");
    }
    public static void quanLySach(){
        System.out.println("=====================QUAN LY SACH====================");
        System.out.println("0.thoat");
        System.out.println("1.them sach");
        System.out.println("2.hien danh sach sach,tai lieu");
        System.out.println("3.sua thong tin sach");
        System.out.println("4.xoa sach");
        System.out.println("5.tim sach");
    }
    public static void quanLyThuThu(){
        System.out.println("=====================QUAN LY THU THU====================");
        System.out.println("0.thoat");
        System.out.println("1.them thu thu");
        System.out.println("2.hien danh sach thu thu");
        System.out.println("3.sua thong tin thu thu");
        System.out.println("4.xoa thong tin thu thu");
        System.out.println("5.tim thong tin thu thu");
    }
    public static void quanLyBanDoc(){
        System.out.println("=====================QUAN LY MUON THONG TIN BAN DOC====================");
        System.out.println("0.thoat");
        System.out.println("1.them ban doc");
        System.out.println("2.hien danh sach ban doc");
        System.out.println("3.sua thong tin ban doc");
        System.out.println("4.xoa thong tin ban doc");
        System.out.println("5.tim thong tin ban doc");
    }
    public static void main(String[] args) {
        int luachon1,luachon2;
        Scanner sc = new Scanner(System.in);
        Dsphieumuon lp = new Dsphieumuon();
        DSSach ls = new DSSach();
        DanhSach dstt = new DanhSach();
        do{
            System.out.println("=====================CHUONG TRINH QUAN LY MUON TRA SACH====================");
            System.out.println("0.dung chuong trinh");
            System.out.println("1.quan ly thong tin thu thu");
            System.out.println("2.quan ly sach");
            System.out.println("3.quan ly thong tin ban doc");
            System.out.println("4.quan ly muon, tra sach");
            System.out.print("hay nhap lua chon cua ban:");
            luachon1= Integer.parseInt(sc.nextLine());
            switch (luachon1){
                //quản lý thông tin thủ thư
                case 1:{
                    do {
                        quanLyThuThu();
                        System.out.print("hay nhap lua chon cua ban:");
                        luachon2 = Integer.parseInt(sc.nextLine());
                        switch (luachon2) {
                            case 1: {//thêm thủ thư
                                dstt.docFile();
                                dstt.themThuThu();
                                dstt.ghiFile();
                                break;
                            }
                            case 2: {//hiện danh sách thủ thư
                                dstt.docFile();
                                dstt.hienDSThuThu();
                                break;
                            }
                            case 3: {//sửa thông tin thủ thư
                                dstt.docFile();
                                dstt.suaThuThu();
                                dstt.xoandfile();
                                dstt.ghiFile();
                                break;
                            }
                            case 4: {//xóa thủ thư
                                dstt.docFile();
                                dstt.xoaThuThu();
                                dstt.xoandfile();
                                dstt.ghiFile();
                                break;
                            }
                            case 5: {// tìm thông tin thủ thư
                                dstt.docFile();
                                do{
                                    String s;
                                    System.out.println("nhap ma thu thu ban muon tim thong tin:");
                                    s=sc.nextLine();
                                    dstt.timThuThu(s);
                                    System.out.println("ban co muon tim tiep(y/n):");
                                }while(sc.nextLine().equalsIgnoreCase("y"));
                                break;
                            }
                        }
                        if(luachon2==0) break;
                    }while(true);
                    break;
                }
                //quản lý sách
                case 2:{
                    do{
                        quanLySach();
                        System.out.print("hay nhap lua chon cua ban:");
                        luachon2 = Integer.parseInt(sc.nextLine());
                        switch (luachon2) {
                            case 1: {//thêm sách
                                ls.docFile();
                                ls.nhapDS();
                                ls.ghiFile();
                                break;
                            }
                            case 2: {//hiện danh sách sách
                                ls.docFile();
                                ls.hienDS();
                                break;
                            }
                            case 3: {//sửa thông tin sách
                                ls.docFile();
                                ls.suaSach();
                                ls.ghiFile();
                                break;
                            }
                            case 4: {//xóa sách
                                ls.docFile();
                                ls.xoaSach();
                                ls.ghiFile();
                                break;
                            }
                            case 5: {// tìm thông tin sách
                                ls.docFile();
                                do{
                                    String s;
                                    System.out.print("nhap ma sach ban muon tim thong tin:");
                                    s=sc.nextLine();
                                    ls.timSach(s);
                                    System.out.println("ban co muon tim tiep(y/n):");
                                }while(sc.nextLine().equalsIgnoreCase("y"));
                            }
                        }
                      if(luachon2==0) break;
                    }while(true);
                    break;
                }
                //quản lý thong tin bạn đọc
                case 3:{
                    do{
                        quanLyBanDoc();
                        System.out.print("hay nhap lua chon cua ban:");
                        luachon2 = Integer.parseInt(sc.nextLine());
                        switch (luachon2) {
                            case 1: {//thêm ban doc
                                dstt.docFile();
                                dstt.themBanDoc();
                                dstt.ghiFile();
                                break;
                            }
                            case 2: {//hiện danh sách ban doc
                                dstt.docFile();
                                dstt.hienDSBanDoc();
                                break;
                            }
                            case 3: {//sửa thông tin ban doc
                                dstt.docFile();
                                dstt.suaBanDoc();
                                dstt.xoandfile();
                                dstt.ghiFile();
                                break;
                            }
                            case 4: {//xóa thông tin bạn đọc
                                dstt.docFile();
                                dstt.xoaBanDoc();
                                dstt.xoandfile();
                                dstt.ghiFile();
                                break;
                            }
                            case 5: {// tìm thông tin bạn đọc
                                dstt.docFile();
                                do{
                                    String s;
                                    System.out.print("nhap ma ban doc ban muon tim thong tin:");
                                    s=sc.nextLine();
                                    dstt.timBanDoc(s);
                                    System.out.println("ban co muon tim tiep(y/n):");
                                }while(sc.nextLine().equalsIgnoreCase("y"));
                            }
                        }
                        if(luachon2==0) break;
                    }while(true);
                    break;
                }
                //quản lý mượn trả sách
                case 4:{
                    do{
                        quanLyPhieuMuon();
                        System.out.print("hay nhap lua chon cua ban:");
                        luachon2= Integer.parseInt(sc.nextLine());
                        switch (luachon2){
                            case 1:{//nhap phieu
                                dstt.docFile();
                                ls.docFile();
                                lp.docFile();
                                lp.nhapPhieu(ls,dstt);
                                lp.ghiFile();
                                break;
                            }
                            case 2:{//hien danh sách thông tin phiếu
                                ls.docFile();
                                dstt.docFile();
                                lp.docFile();
                                lp.hienDSPhieu(ls,dstt);
                                break;
                            }
                            case 3:{//sửa thông tin phiếu
                                dstt.docFile();
                                ls.docFile();
                                lp.docFile();
                                lp.suaTTphieu(ls,dstt);
                                lp.ghiFile();
                                break;
                            }
                            case 4:{//xoa phiếu
                                lp.docFile();
                                lp.xoaPhieu();
                                lp.ghiFile();
                                break;
                            }
                            case 5:{//tìm phiếu
                                do{
                                    lp.docFile();
                                    ls.docFile();
                                    dstt.docFile();
                                    String maphieu;
                                    System.out.println("nhap ma phieu can tim:");
                                    maphieu=sc.nextLine();
                                    lp.timphieu(maphieu,ls,dstt);
                                    System.out.println("ban co muon tiep tuc(y/n):");
                                }while(sc.nextLine().equalsIgnoreCase("y"));
                                break;
                            }
                            case 6:{//sắp xếp theo trạng thái
                                lp.docFile();
                                ls.docFile();
                                dstt.docFile();
                                lp.sxtrangthai();
                                lp.hienDSPhieu(ls, dstt);
                                lp.ghiFile();
                                break;
                            }
                            case 7:{//sắp xếp theo tiền cọc
                                ls.docFile();
                                ls.docFile();
                                dstt.docFile();
                                lp.docFile();
                                lp.sxtiencoc(ls);
                                lp.hienDSPhieu(ls,dstt);
                                lp.ghiFile();
                                break;
                            }
                        }
                        if(luachon2==0) break;
                    }while(true);
                    break;
                }//hết case 4
            }//hết switch lua chọn đối tượng quản lý
            if(luachon1==0) break;
        }while(true);
    }
}