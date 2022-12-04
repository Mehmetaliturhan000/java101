package Giris;

import java.util.Scanner;
public class TekSayiGirileneKadarCiftveDortKatlariBulma {
    public static void main(String[] args) {
        int sayi =  0, toplam = 0;

        Scanner input = new Scanner(System.in);

        while(sayi % 2 == 0)
        {
            System.out.print("Sayı Giriniz : ");
            sayi = input.nextInt();

            if(sayi % 4 == 0)
            {
                toplam+=sayi;
            }

        }

        System.out.println("Toplam : " + toplam);

    }
}
