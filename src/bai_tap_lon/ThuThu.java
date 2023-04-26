package bai_tap_lon;
import java.util.Scanner;

public class ThuThu extends Person  {
    protected String mathuthu;
    public String getMathuthu() {
        return mathuthu;
    }

    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ma thu thu:");
        this.mathuthu=sc.nextLine();
        super.nhapPerson();
    }
    public void hienTT(){
        System.out.println("ma thu thu:"+this.mathuthu);
        super.hienperson();

    }
}
