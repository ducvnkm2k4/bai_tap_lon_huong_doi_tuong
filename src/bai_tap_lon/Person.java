package bai_tap_lon;
import java.io.Serializable;
import java.util.Scanner;

public class Person implements Serializable {
    protected String hoten;
    protected String gioitinh;
    protected String ngaysinh;

    public Person(String hoten, String gioitinh, String sdt, String diachi, String email) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.email = email;
    }

    public Person() {
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    protected String sdt;
    protected String diachi;
    protected String email;

    public void nhapPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ho ten:");
        this.hoten=sc.nextLine();
        System.out.print("gioi tinh:");
        this.gioitinh=sc.nextLine();
        System.out.print("ngay sinh:");
        this.ngaysinh=sc.nextLine();
        System.out.print("so dien thoai:");
        this.sdt=sc.nextLine();
        System.out.print("dia chi:");
        this.diachi=sc.nextLine();
        System.out.print("email:");
        this.email=sc.nextLine();

    }
    public void hienperson(){
        System.out.println("ho ten:"+this.hoten);
        System.out.println("gioi tinh:"+this.gioitinh);
        System.out.println("ngay sinh:"+this.ngaysinh);
        System.out.println("so dien thoai:"+this.sdt);
        System.out.println("dia chi:"+this.diachi);
        System.out.println("email:"+this.email);
    }
}
