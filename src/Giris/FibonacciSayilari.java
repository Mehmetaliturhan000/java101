package Giris;
import java.util.Scanner;
public class FibonacciSayilari {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısını Giriniz : ");
        number = input.nextInt();

        int onceki = 0,simdiki = 0,sonraki;

        for(int i = 0;i <= number;i++)
        {
            if(i == 0)
            {
                onceki = 0;
                simdiki = 0;
            }

            if(i == 1)
            {
                onceki = 0;
                simdiki = 1;
            }

            if(i != 0 && i!= 1)
            {
                sonraki = onceki + simdiki;
                onceki = simdiki;
                simdiki = sonraki;
            }

            System.out.print(simdiki + " ");
        }



    }

}
