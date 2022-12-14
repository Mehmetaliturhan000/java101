package Giris;

import java.util.Scanner;

public class GirilenSayidanKucuk4ve5inKuvvetleriniBulma {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Sınır Sayısını Giriniz : ");
        sayi = input.nextInt();

        System.out.println("Girilen Sayıya Kadar 4'ün Kuvvetleri : ");
        for(int i = 1;i<sayi;i*=4)
        {
            System.out.println(i);
        }

        System.out.println("Girilen Sayıya Kadar 5'in Kuvvetleri : ");
        for(int j = 1;j<sayi;j*=5)
        {
            System.out.println(j);
        }
    }
}
