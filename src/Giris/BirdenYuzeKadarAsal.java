package Giris;

public class BirdenYuzeKadarAsal {
    public static void main(String[] args) {
        boolean asalMi = true;

        for(int i = 1; i <= 100;i++)
        {
            for(int j = 2; j < i; j++ )
            {
                if(i % j == 0)
                {
                    asalMi = false;
                    break;
                }
                else {
                    asalMi = true;
                }
            }

            if(asalMi && i != 1)
            {
                System.out.print(i + " ");
            }

        }

    }
}

