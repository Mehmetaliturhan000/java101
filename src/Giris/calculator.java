package Giris;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
         /*
        Not Ortalaması Hesaplayan Program Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
        ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Ödev:
        Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise
        "Sınıfta Kaldı" yazsın.Not : If ve Else kullanılmayacak...
        */

        //Değişkenleri oluştur.
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfımız tanımla.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al.
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        //Girilen notların ortalamasını al.
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        //Not ortalaması yazdır.
        System.out.println("Ortalamanız : " + sonuc);

        boolean kosul = sonuc >= 60;
        String gectiMi = kosul ? "Sınıfı geçti." : "Sınıfta kaldı.";
        System.out.println(gectiMi);
    }
}
