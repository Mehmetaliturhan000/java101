package Giris;

import java.util.Scanner;

public class DaireAlanveCevre {
    public static void main(String[] args) {

        int r,a;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz : ");
        r = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);

        System.out.println("Daire diliminin alanı için açıyı giriniz : ");
        a = inp.nextInt();

        double dilimAlan = (pi * r * r * a) / 360;
        System.out.println("Daire diliminin alanı : " + dilimAlan);
    }
}
