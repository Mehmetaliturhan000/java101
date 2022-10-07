package Giris;

import java.util.Scanner;

public class DersGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,dersSayaci = 0,notToplami = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        if(mat >= 0 && mat <= 100)
        {
            dersSayaci++;
            notToplami+=mat;
        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if(fizik >= 0 && fizik <= 100)
        {
            dersSayaci++;
            notToplami+=fizik;
        }

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        if(turkce >= 0 && turkce <= 100)
        {
            dersSayaci++;
            notToplami+=turkce;
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if(kimya >= 0 && kimya <= 100)
        {
            dersSayaci++;
            notToplami+=kimya;
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        if(muzik >= 0 && muzik <= 100)
        {
            dersSayaci++;
            notToplami+=muzik;
        }

        if(dersSayaci != 0)
        {
            average = notToplami / dersSayaci;
            if(average <= 55)
            {
                System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere!");
            }

            else
            {
                System.out.println("Tebrikler, sınıfı geçtiniz!");
            }

            System.out.println("Ortalamanız : " + average);
        }

        else
        {
          System.out.print("Bütün 0-100 aralığı dışında olduğu için ortalama hesaplanamadı!");
        }

    }
}
