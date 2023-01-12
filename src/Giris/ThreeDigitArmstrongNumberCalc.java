package Giris;

import java.util.Scanner;

public class ThreeDigitArmstrongNumberCalc {

    public static void main(String[] args) {
       for(int i = 100 ; i<= 999; i++)
       {
           ArmstrongCheck(i);
       }
    }

    private static void ArmstrongCheck(int numberToCheck) {
        int number = numberToCheck;
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;


        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;

            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayı değildir.");
        }
    }

}
