package Giris;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int n,k;
        int sonuc = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();

        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();

        if((n == 0) && (k == 0))
        {
           System.out.println("0'ın 0. üssü tanımsızdır...");
        }

        else {
            for(int i = 1; i <= k;i++)
            {
                sonuc *= n;
            }

            System.out.println("Cevap : " + sonuc);
        }

    }
}
