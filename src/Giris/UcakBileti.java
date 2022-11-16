package Giris;

import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int mesafe = 0,yas = 0,yolculuk_tipi = 1;
        double kmUcret = 0.1,normalTutar,yas_indirimliTutar,yasIndirimi = 0.0,gidis_donusIndirimi = 0.0,toplam_IndirimliTutar,toplamTutar;
        boolean veriDurumu = false;

        while(!veriDurumu)

        {
            System.out.print("Mesafeyi km türünden giriniz : ");
            Scanner input = new Scanner(System.in);
            mesafe = input.nextInt();

            System.out.print("Yaşınızı giriniz : ");
            yas = input.nextInt();

            System.out.print("Yolculuk tipini giriniz ( 1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
            yolculuk_tipi = input.nextInt();

            if( ((mesafe <=0) || (yas <= 0) || !(yolculuk_tipi == 1 || yolculuk_tipi == 2))  )
            {
                System.out.println("Hatalı veri girdiniz!");
                veriDurumu = false;
            }
            else
            {
                veriDurumu = true;
            }
        }

        normalTutar = mesafe * kmUcret;
        if(yas < 12)
        {
            yasIndirimi = 0.5;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimi = 0.1;
        } else if (yas >= 65) {
            yasIndirimi = 0.3;
        }
        else {
            yasIndirimi = 0.0;
        }

        yas_indirimliTutar = normalTutar - (normalTutar * yasIndirimi);

        if(yolculuk_tipi == 2)
        {
            gidis_donusIndirimi = 0.2;
            toplam_IndirimliTutar = yas_indirimliTutar - (yas_indirimliTutar* gidis_donusIndirimi);
            toplamTutar = toplam_IndirimliTutar * 2;
        }
        else {
            gidis_donusIndirimi = 0.0;
            toplamTutar = yas_indirimliTutar;
        }

        System.out.println("Toplam Tutar : " + toplamTutar);
    }

}
