package Giris;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;

        System.out.print("Yıl Giriniz : ");
        Scanner input = new Scanner(System.in);
        yil = input.nextInt();

        if(yil % 4 == 0)
        {
            if(yil % 100 == 0)
            {
                if(yil % 400 == 0)
                {
                    System.out.println(yil + " artık bir yıldır!");
                }
                else
                {
                    System.out.println(yil + " artık bir yıl değildir!");
                }
            }
            else
            {
                System.out.println(yil + " artık bir yıldır!");
            }
        }

        else
        {
            System.out.println(yil + " artık bir yıl değildir!");
        }
    }
}
