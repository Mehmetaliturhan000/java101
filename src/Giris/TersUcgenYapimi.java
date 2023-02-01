package Giris;

import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayı : ");
        number = input.nextInt();

        for(int i = 1; i <= number; i++)
        {
            for(int k = 2; k <= i;k++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j<= 2 *(number - i) + 1 ;j++)
            {
                System.out.print("*");
            }

            System.out.println("");

        }


    }
}
