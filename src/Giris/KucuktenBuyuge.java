package Giris;

import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayı : ");
        a = input.nextInt();
        System.out.print("2. sayı : ");
        b = input.nextInt();
        System.out.print("3. sayı : ");
        c = input.nextInt();

        if(a <= b)
        {
            if(b <= c)
            {
                System.out.print(a + " <= " + b + " <= " + c );
            }

            else
            {
                if (a <= c)
                {
                    System.out.print(a + " <= " + c + " <= " + b );
                }

                else
                {
                    System.out.print(c + " <= " + a + " <= " + b );
                }
            }
        }

        else
        {
            if(b >= c)
            {
                System.out.print(c + " <= " + b + " <= " + a );
            }

            else
            {
                System.out.print(b + " <= " + c + " <= " + a );
            }
        }
    }
}
