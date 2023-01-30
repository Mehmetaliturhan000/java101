package Giris;

import java.util.Scanner;

public class EbobEkokWhile {
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

        int i = 1;
        while(i <= n1)
        {
            if(n1 % i == 0 && n2 % i == 0)
            {
                ebob = i;
            }
            i++;
        }


        System.out.println("Birinci Yol İle Bulunan En büyük ortak bölen : " + ebob);

        System.out.println("******************************");

        int k = n1;

        while(k >= 1)
        {

            if(n1 % k == 0 && n2 % k == 0)
            {
                ebob = k;
                System.out.println("İkinci Yol İle Bulunan En büyük ortak bölen : " + ebob);
                break;
            }

            k--;
        }

        System.out.println("******************************");


        int j =1;

        while(j <= (n1 * n2))
        {
            if(j % n1 == 0 && j % n2 == 0)
            {
                ekok = j;
                System.out.println("En Küçük Ortak Kat : " + ekok);
                break;
            }
            j++;
        }


        System.out.println("******************************");

        System.out.println("Formül İle Bulunan En Küçük Ortak Kat : " + (n1 * n2) / ebob);


    }
}
