package Giris;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Sayı giriniz : ");
       int number = input.nextInt();
       int basNumber  = 0;
       int tempNumber = number;
       int basValue;
       int result = 0;
       int basPow;


        while(tempNumber != 0 )
        {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;

        while(tempNumber != 0)
        {
            basValue = tempNumber % 10;
            basPow = 1;

            for(int i = 1; i <= basNumber; i++)
            {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if(result == number)
        {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        }
        else {
            System.out.println(number + " sayısı bir Armstrong sayı değildir.");
        }



        /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245;
        // 245 / 10 = 24;
        // 24 / 10 = 2;
        // 2 / 10 = 0;
        // 0 / 10 = 0;

        while(a != 0 )
        {
            a = a / 10;
            numberCounter++;
        }

        // Bir Sayının Son Basamağını Bulma
        // 2451
        int b = 2451;
        int c = b % 10;

        // Bir Sayının Üssünü Alma
        int sub = 2, sup = 3;
        int result = 1;

        for(int i = 1; i <= sup; i++)
        {
            result *= sub;
        }

        */

    }
}
