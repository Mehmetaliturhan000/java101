package Giris;
import java.util.Scanner;
public class YildizlarlaElmasYapma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int k = 1; k<= (n - i); k++)
            {
                System.out.print(" ");
            }

           for(int j = 1; j <= (2*i)-1 ; j++)
           {
                System.out.print("*");
           }

           System.out.println("");
        }

       for(int b = 1; b<=n-1 ; b++)
       {
           for(int c = 1; c<=b;c++)
           {
               System.out.print(" ");
           }

           for(int d = 1; d <= 2 *(n - b) - 1  ; d++)
           {
               System.out.print("*");
           }

           System.out.println(" ");
       }


    }

}
