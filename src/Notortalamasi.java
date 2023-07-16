import java.util.Scanner;
public class Notortalamasi {
    public static void main(String[] args) {
        int ingilizce,matematik,türkçe,kimya,fizik,biyoloji;
        Scanner veri = new Scanner(System.in);
        System.out.print("ingilizce notunuzu giriniz:");
        ingilizce = veri.nextInt();
        System.out.print("matematik notunuzu giriniz:");
        matematik = veri.nextInt();
        System.out.print("türkçe notunuzu giriniz:");
        türkçe = veri.nextInt();
        System.out.print("kimya notunuzu giriniz:");
        kimya = veri.nextInt();
        System.out.print("fizik notunuzu giriniz:");
        fizik = veri.nextInt();
        System.out.print("biyoloji notunuzu giriniz:");
        biyoloji = veri.nextInt();
        int total = (ingilizce +matematik+kimya+biyoloji+türkçe+fizik)/6;
        System.out.println("ortalamanız " 6+total);
        boolean kosul1 = total<60;
        String str = kosul1?" Geçtiniz":" Kaldınız";
        System.out.println(str);





    }
}
