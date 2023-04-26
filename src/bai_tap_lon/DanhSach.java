package bai_tap_lon;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {
    private ArrayList<Person> list;

    public DanhSach() {
        list = new ArrayList<Person>();
    }
    //thêm thông tin thủ thư
    public void themThuThu() {
        Scanner sc = new Scanner(System.in);
        do {
            ThuThu s = new ThuThu();
            System.out.println("--------------------------------------------");
            System.out.println("hay nhap thong tin cua thu thu");
            s.nhapTT();
            list.add(s);
            System.out.print("ban muon them tiep khong(y/n):");
        } while (sc.nextLine().equalsIgnoreCase("y"));
    }
    //thêm thông tin bạn đọc
    public void themBanDoc() {
        Scanner sc = new Scanner(System.in);
        do {
            BanDoc s = new BanDoc();
                System.out.println("--------------------------------------------");
                System.out.println("hay nhap thong tin cua ban doc");
                s.nhapBanDoc();
            list.add(s);
            System.out.print("ban muon them tiep khong(y/n):");
        } while (sc.nextLine().equalsIgnoreCase("y"));
    }
    //hiện danh sách bạn đọc
    public void hienDSThuThu() {
        int dem=0;
        for (Person a : list) {
            if (a instanceof ThuThu) {
                System.out.println("----------------------------------------- ");
                ((ThuThu) a).hienTT();
                dem++;
            }
        }
        if(dem==0) System.out.println("chua co thong tin thu thu nao duoc them");
    }
    //hiện danh sách bạn đọc
    public void hienDSBanDoc() {
        int dem=0;
        for (Person a : list) {
            if (a instanceof BanDoc) {
                System.out.println("--------------------------------------------");
                ((BanDoc) a).hienBanDoc();
                dem++;
            }
        }
        if(dem==0) System.out.println("chua co thong tin ban doc nao duoc them");
    }
    //tìm thông tin thủ thư
    public void timThuThu(String mathuthu) {
        boolean kt = false;
        for (Person a : list)
            if (a instanceof ThuThu)
                if (mathuthu.compareTo(((ThuThu) a).getMathuthu()) == 0) {
                    ((ThuThu) a).hienTT();
                    kt = true;
                    break;
                }
        if (kt == false) System.out.println("khong tim thay thu thu");
    }

    public int kTThuThu(String mathuthu) {
        for (Person a : list)
            if (a instanceof ThuThu)
                if (mathuthu.compareTo(((ThuThu) a).getMathuthu()) == 0)
                    return 1;
        return 0;
    }
    //tìm thông tin bạn đọc
    public void timBanDoc(String maBandoc) {
        boolean kt = false;
        for (Person a : list) {
            if(a instanceof BanDoc) {
                if (maBandoc.compareTo(((BanDoc) a).getMabandoc()) == 0) {
                    ((BanDoc) a).hienBanDoc();
                    kt = true;
                    break;
                }
            }
        }
        if (kt == false) System.out.println("khong tim thay thu thu");
    }

    public int kTBanDoc(String maBandoc) {
        for (Person a : list)
            if (a instanceof BanDoc)
                if (maBandoc.compareTo(((BanDoc) a).getMabandoc()) == 0)
                    return 1;
        return 0;
    }
    //xóa thông tin thủ thư
    public void xoaThuThu() {
        Scanner sc = new Scanner(System.in);
        String mathuthu;
        do {
            int kt = 0;
            System.out.print("hay nhap ma thu thu can xoa thong tin:");
            mathuthu = sc.nextLine();
            for (Person a : list) {
                if (a instanceof ThuThu) {
                    if (mathuthu.compareTo(((ThuThu) a).getMathuthu()) == 0) {
                        list.remove(a);
                        System.out.println("xoa thanh cong");
                        kt = 1;
                        break;
                    }
                }
            }
            if (kt == 0) System.out.println("ma thu thu ban nhap khong dung");
            System.out.print("ban co muon xoa tiep khong(y/n):");
        } while (sc.nextLine().equalsIgnoreCase("y"));
    }
    //xóa thông tin bạn đọc
    public void xoaBanDoc() {
        Scanner sc = new Scanner(System.in);
        String maBandoc;
        do {
            int kt = 0;
            System.out.print("hay nhap ma ban doc can xoa thong tin:");
            maBandoc = sc.nextLine();
            for (Person a : list) {
                if(a instanceof  BanDoc) {
                    if (maBandoc.compareTo(((BanDoc) a).getMabandoc()) == 0) {
                        list.remove(a);
                        System.out.println("xoa thanh cong");
                        kt = 1;
                        break;
                    }
                }
            }
            if (kt == 0) System.out.println("ma phieu ban nhap khong dung");
            System.out.print("ban co muon xoa tiep khong(y/n):");
        } while (sc.nextLine().equalsIgnoreCase("y"));
    }
    //sửa thông tin thủ thư
    public void suaThuThu() {
        Scanner sc = new Scanner(System.in);
        String mathuthu;
        do {
            ThuThu b = new ThuThu();
            int kt = 0;
            System.out.print("hay nhap ma thu thu can sua:");
            mathuthu = sc.nextLine();
            for (Person a : list) {
                if(a instanceof ThuThu) {
                    if (mathuthu.compareTo(((ThuThu) a).getMathuthu()) == 0) {
                        System.out.println("da thay tìm thay ," +
                                "hay nhap thong tin sach de thay the");
                        b.nhapTT();
                        list.set(list.indexOf(a), b);
                        System.out.println("sua thanh cong");
                        kt = 1;
                        break;
                    }
                }
            }
            if (kt == 0) System.out.println("ma thu thu ban nhap khong dung hay nhap lai");
            System.out.print("ban co muon sua tiep khong(y/n):");
        } while (sc.nextLine().equalsIgnoreCase("y"));
    }
    //sửa thông tin bạn đọc
    public void suaBanDoc() {
        Scanner sc = new Scanner(System.in);
        String maBandoc;
        do {
            int kt = 0;
            BanDoc b = new BanDoc();
            System.out.println("hay nhap ma ban doc can sua:");
            maBandoc = sc.nextLine();
            for (Person a : list) {
                if(a instanceof  BanDoc) {
                    if (maBandoc.compareTo(((BanDoc) a).getMabandoc()) == 0) {
                        System.out.println("da thay thong tin ban doc" +
                                " hay nhap thong tin de thay the,");
                        b.nhapBanDoc();
                        list.set(list.indexOf(a), b);
                        System.out.println("sua thanh cong");
                        kt = 1;
                        break;
                    }
                }
            }
            if (kt == 0) System.out.println("ma ban doc ban nhap khong dung hay nhap lai");
            System.out.print("ban co muon sua tiep khong(y/n):");
        } while (sc.nextLine().equalsIgnoreCase("y"));
    }

    public void ghiFile() {
        try {
            FileOutputStream fout = new FileOutputStream("danhsach.bin");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(list);
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
            FileInputStream fin = new FileInputStream("danhsach.bin");
            ObjectInputStream oin = new ObjectInputStream(fin);
            list = (ArrayList<Person>) oin.readObject();
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
            FileOutputStream fileOutputStream = new FileOutputStream("danhsach.bin");
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
