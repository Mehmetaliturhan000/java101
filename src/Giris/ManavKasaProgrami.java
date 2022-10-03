package Giris;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? : ");
        double armut_kilo = inp.nextDouble();
        System.out.print("Elma kaç kilo ? : ");
        double elma_kilo = inp.nextDouble();
        System.out.print("Domates kaç kilo ? : ");
        double domates_kilo = inp.nextDouble();
        System.out.print("Muz kaç kilo ? : ");
        double muz_kilo = inp.nextDouble();
        System.out.print("Patlıcan kaç kilo ? :");
        double patlican_kilo = inp.nextDouble();

        double armut_fiyat = 2.14,elma_fiyat = 3.67,domates_fiyat = 1.11,muz_fiyat = 0.95,patlican_fiyat = 5.0;
        double toplam = armut_kilo * armut_fiyat + elma_kilo * elma_fiyat + domates_kilo * domates_fiyat + muz_fiyat * muz_kilo + patlican_kilo * patlican_fiyat;

        System.out.println("Toplam Tutar : " + toplam + " TL");
    }
}
