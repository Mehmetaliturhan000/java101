package Giris;

import java.util.Scanner;

public class Kombinasyon {

    static int Factorial(int number) {

        if(number >= 0)
        {
            int total = 1;

            for(int i = 1 ; i<=number ; i++)
            {
                total *= i;
            }

            return total;
        }
        else {
            System.out.print("Hatalı işlem yaptınız, lütfen 0 veya 0'dan büyük bir sayı giriniz ...");

        }

        return -1;
    }


    public static void main(String[] args) {
        int n, r,kombinasyon;

        System.out.println("n giriniz : ");

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        System.out.println("r giriniz : ");
        r = input.nextInt();

        if (n > r && (n > 0) && (r > 0))
        {
            kombinasyon = Factorial(n) / (Factorial(r) * Factorial((n-r)));
            System.out.println("n'in r'li kombinasyonu : ");
            System.out.println(kombinasyon);
        }

        else {
            System.out.print("Hatalı işlem yaptınız, n r'den büyük veya r'ye eşit olmalıdır ...");
        }

    }
}
