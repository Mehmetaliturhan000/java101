package Giris;

import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {
        String userName,password,request,newPassword;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();
        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java123"))
        {
            System.out.print("Giriş yaptınız!");
        }
        else
        {
            System.out.println("Hatalı şifre girdiniz!");
            System.out.println("Şifreyi sıfırlamak istiyor musunuz? -evet/-hayır");
            request = inp.nextLine();

            if(request.equals("evet"))
            {
                System.out.print("Yeni şifrenizi giriniz : ");
                newPassword = inp.nextLine();
                if(newPassword.equals("java123"))
                {
                    while(newPassword.equals("java123"))
                    {
                        System.out.println("Şifre oluşturulamadı, lütfen eskisinden farklı bir şifre giriniz!");
                        newPassword = inp.nextLine();
                    }

                    System.out.println("Yeni şifre oluşturuldu!");

                }
                else
                {
                    System.out.println("Yeni şifre oluşturuldu!");
                }
            }

            else
            {
                System.out.println("Program sonlandırıldı!");
            }

        }

    }
}
