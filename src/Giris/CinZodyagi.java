package Giris;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int dogumYili,mod;

        System.out.print("Doğum Yılınızı Giriniz : ");
        Scanner input = new Scanner(System.in);
        dogumYili = input.nextInt();

        mod = dogumYili % 12;

        if(mod == 0)
        {
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        } else if (mod == 1) {
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        } else if (mod == 2) {
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        } else if (mod == 3) {
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        } else if (mod == 4) {
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        } else if (mod == 5) {
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        } else if (mod == 6) {
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        } else if (mod == 7) {
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        } else if (mod == 8) {
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        } else if (mod == 9) {
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        } else if (mod == 10) {
            System.out.println("Çin Zodyağı Burcunuz: At");
        } else if (mod == 11) {
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }


    }
}
