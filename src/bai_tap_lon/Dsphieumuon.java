package bai_tap_lon;
import java.io.*;
import java.util.*;

public class Dsphieumuon {
    private ArrayList<PhieuMuon> listphieu;
    public Dsphieumuon(){
        listphieu = new ArrayList<PhieuMuon>();
    }
    public  void nhapPhieu(DSSach c ,DanhSach ds){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----------------------------------------------");
            PhieuMuon p = new PhieuMuon();
            p.nhapPhieuMuon(c,ds);
            listphieu.add(p);
            System.out.println("ban co muon them tiep khong(y/n):");
        }while(sc.nextLine().equalsIgnoreCase("y"));
    }
    public void hienDSPhieu(DSSach c, DanhSach ds){
        for(PhieuMuon p:listphieu) {
            System.out.println("----------------------------------------------");
            p.hienPhieuMuon(c, ds);
        }
    }
    public void timphieu(String s,DSSach c,DanhSach ds){
        int kt =0;
        for(PhieuMuon p:listphieu){
            if(s.compareTo(p.getMaPhieumuon())==0) {
                System.out.println("da tim thay phieu");
                p.hienPhieuMuon(c,ds);
                kt=1;
                break;
            }
        }
        if(kt==0) System.out.println("khong tim thay phieu muon");
    }
    public void xoaPhieu(){
        Scanner sc = new Scanner(System.in);
        String maphieu;
        do{
            int kt=0;
            System.out.println("hay nhap ma phieu cua phieu can xoa:");
            maphieu=sc.nextLine();
            for(PhieuMuon p:listphieu){
                if(maphieu.compareTo(p.getMaPhieumuon())==0) {
                    listphieu.remove(p);
                    System.out.println("xoa thong tin phieu thanh cong");
                    kt=1;
                    break;
                }
            }
            if(kt==0) System.out.println("ma phieu ban nhap khong, dung hay nhap lai");
            System.out.print("ban co muon xoa tiep khong(y/n):");
        }while(sc.nextLine().equalsIgnoreCase("y"));
    }
    public void suaTTphieu(DSSach c, DanhSach ds){
        Scanner sc = new Scanner(System.in);
        String maphieu;
        do{
            int kt=0;
            PhieuMuon pm= new PhieuMuon();
            System.out.println("hay nhap ma phieu cua phieu can sua:");
            maphieu=sc.nextLine();
            for(PhieuMuon p:listphieu){
                if(maphieu.compareTo(p.getMaPhieumuon())==0) {
                    System.out.println("da thay thong phieu muon, hay nhap thong tin de thay the");
                    pm.nhapPhieuMuon(c,ds);
                    listphieu.set(listphieu.indexOf(p),pm);
                    System.out.println("sua thanh cong");
                    kt=1;
                    break;
                }
            }
            if(kt==0) System.out.println("ma phieu ban nhap khong dung");
            System.out.print("ban co muon sua tiep khong(y/n):");
        }while(sc.nextLine().equalsIgnoreCase("y"));
    }
    public void sxtrangthai(){
        Collections.sort(listphieu, new Comparator<PhieuMuon>() {
            @Override
            public int compare(PhieuMuon o1, PhieuMuon o2) {
                return o1.getTrangthai().compareTo(o2.getTrangthai());
            }
        });
    }
    public void sxtiencoc(DSSach c){
        Collections.sort(listphieu, new Comparator<PhieuMuon>() {
            @Override
            public int compare(PhieuMuon o1, PhieuMuon o2) {
                if(o1.tinhTienCoc(c)>o2.tinhTienCoc(c)) return 1;
                else if(o1.tinhTienCoc(c)==o2.tinhTienCoc(c))   return 0;
                else return -1;
            }
        });
    }
    public void ghiFile(){
        try {
            FileOutputStream fout = new FileOutputStream("DSPhieu.bin");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(listphieu);
            fout.close();
            oout.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public  void docFile(){
        try {
            FileInputStream fin = new FileInputStream("DSPhieu.bin");
            ObjectInputStream oin = new ObjectInputStream(fin);
           listphieu =(ArrayList<PhieuMuon>) oin.readObject();
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
    public void xoandfile(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("DSPhieu.bin", false);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
