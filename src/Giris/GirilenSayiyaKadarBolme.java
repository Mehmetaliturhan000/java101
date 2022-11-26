package Giris;

import java.util.Scanner;

public class GirilenSayiyaKadarBolme {
    public static void main(String[] args) {
        int sayi;
        int bolunenSayilar = 0;
        double ortalama = 0;
        int sayiAdedi = 0;

        System.out.print("Sayı giriniz : ");

        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();

        if(sayi == 0)
        {
            ortalama = 0;
        }
        else {
            for(int i = 1;i<sayi;i++)
            {
                if(i % 3 == 0 && i % 4 == 0)
                {
                    bolunenSayilar+=i;
                    sayiAdedi++;
                }
            }

            if(sayiAdedi !=0 )
            {
                ortalama = bolunenSayilar / sayiAdedi;
            }

            else {
                ortalama = 0;
            }

        }

        System.out.println("0'dan girdiğiniz sayıya kadar 3'e ve 4'e bölünen sayıların ortalaması :  " + ortalama);




    }
}
