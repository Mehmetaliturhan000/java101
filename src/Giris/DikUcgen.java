package Giris;
import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlayalım.

        int a,b;
        double alan,c;

        //Kullanıcıdan verileri alalım
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2.Kenarı Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a *a ) + (b * b));
        System.out.println("Hipotenüs : " + c);
        alan = (a * b) / 2.0 ;
        System.out.println("Dik Üçgenin Alanı : " + alan);

        //Üç kenarının kullanıcıdan alınarak alanın hesaplayalım.
        System.out.println("İkinci kısım : ");
        double a2,b2,c2,alan2;
        double u;
        System.out.println("1.Kenarı Giriniz : ");
        a2 = girdi.nextInt();
        System.out.println("2.Kenarı Giriniz : ");
        b2 = girdi.nextInt();
        System.out.println("3.Kenarı Giriniz : ");
        c2 = girdi.nextInt();
        u = (a + b + c) / 2;
        alan2 = Math.sqrt(u * (u - a2) * (u - b2) * (u - c2));
        System.out.println("Üçgenin Alanı : " + alan2);

    }
}
