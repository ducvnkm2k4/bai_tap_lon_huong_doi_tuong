package bai_tap_lon;


import java.util.Scanner;

public class BanDoc extends Person {


    protected String mabandoc;
   protected String ngaythem;
    public void setMabandoc(String mabandoc) {
        this.mabandoc = mabandoc;
    }

    public void setNgaythem(String ngaythem) {
        this.ngaythem = ngaythem;
    }


    public BanDoc() {
    }
    public String getMabandoc() {
        return mabandoc;
    }

    public void nhapBanDoc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ma ban doc:");
        this.mabandoc = sc.nextLine();
        super.nhapPerson();
        System.out.print("ngay them:");
        this.ngaythem=sc.nextLine();
    }
    public void hienBanDoc(){
        System.out.println("ma ban doc:"+this.mabandoc);
        super.hienperson();
        System.out.println("ngay them:"+this.ngaythem);
    }

}
