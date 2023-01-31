package Giris;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        if(sayi < 0)
        {
            System.out.println("Mükemmel sayı tanımı pozitif sayılar içindir, lütfen pozitif bir sayı giriniz.");
            System.exit(0);
        }

        for(int i = 1;i < sayi; i++)
        {
            if(sayi % i == 0)
            {
                toplam += i;
            }

        }

        if(toplam == sayi)
        {
            System.out.println(sayi + " mükemmel sayıdır.");
        }

        else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }

    }
}
