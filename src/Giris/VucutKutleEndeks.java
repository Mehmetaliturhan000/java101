package Giris;

import java.util.Scanner;

public class VucutKutleEndeks {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        int kilo = inp.nextInt();
        double vki = kilo / (boy*boy);
        System.out.println("Vücut kütle endeksiniz : " + vki);

    }
}
