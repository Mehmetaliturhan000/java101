package Giris;

import java.util.Scanner;

public class MinMaxDeger {
    public static void main(String[] args) {
        int adet;
        int temp;
        int max = 0;
        int min = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        adet = input.nextInt();

        if(adet == 0)
        {
            System.out.println("Çıkış yapılıyor...");
            System.exit(0);
        }


        int i = 1;

        do {
            System.out.print(i + ". sayıyı giriniz : ");

            temp = input.nextInt();

            if(i == 1)
            {
                max = temp;
                min = temp;
            }

            else {

                if(temp >= max)
                {
                    max = temp;
                }

                if(temp <= min)
                {
                    min = temp;
                }

            }

            i++;

        }
        while (i <= adet);


        System.out.println("En büyük sayı : " + max);

        System.out.println("En küçük sayı : " + min);

    }
}
