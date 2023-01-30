package Giris;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;
        int ekok = 1;

        if(n2 < n1)
        {
            temp = n2;
            n2 = n1;
            n1 = temp;
        }

        for(int i = 1; i <= n1; i++)
        {
            if(n1 % i == 0 && n2 % i == 0)
            {
                ebob = i;
            }
        }

        System.out.println("Birinci Yol İle Bulunan En büyük ortak bölen : " + ebob);

        System.out.println("******************************");


        for(int k = n1; k >= 1;k--)
        {
            if(n1 % k == 0 && n2 % k == 0)
            {
                ebob = k;
                System.out.println("İkinci Yol İle Bulunan En büyük ortak bölen : " + ebob);
                break;
            }
        }

        System.out.println("******************************");

        for(int j = 1; j <= (n1 * n2); j++)
        {
            if(j % n1 == 0 && j % n2 == 0)
            {
                ekok = j;
                System.out.println("En Küçük Ortak Kat : " + ekok);
                break;
            }
        }

        System.out.println("******************************");

        System.out.println("Formül İle Bulunan En Küçük Ortak Kat : " + (n1 * n2) / ebob);

    }
}
