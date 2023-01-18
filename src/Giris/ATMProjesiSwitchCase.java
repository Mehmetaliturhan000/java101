package Giris;

import java.util.Scanner;

public class ATMProjesiSwitchCase {
    public static void main(String[] args) {
        String username,password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while(right > 0)
        {
            System.out.print("Kullanıcı adınız : ");
            username = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if(username.equals("patika") && password.equals("dev123"))
            {
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("""
                            1- Para Yatır
                            2- Para Çek
                            3- Bakiye Sorgula
                            4- Çıkış Yap""");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye!");
                            } else {
                                balance -= price;
                            }
                        }
                        case 3 -> System.out.println("Bakiyeniz : " + balance);
                        default -> {
                        }
                    }
                }
                while (select != 4);
                System.out.println("Tekrar görüşmek üzere!");
                break;
            }
            else
            {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0)
                {
                    System.out.println("Hesabınız bloke olmuştur, lütfen banka ile iletişime geçiniz.");
                }
                else {
                    System.out.println("Kalan hakkınız : " + right);
                }

            }
        }









    }
}
