package patikaDev101;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        String userName, password,sifirlama, newPassword ;
        Scanner input= new Scanner(System.in);
        System.out.print(" Kullanci Adinizi yaziniz  ");
        userName=input.nextLine( );
        System.out.print(" Sifrenizi yaziniz  ");
        password=input.nextLine();

        if (userName.equals("javaLover") && password.equals("java123") ){
            System.out.println(" ***  Giris Basarili **** ");

        }
        else{
            System.out.println("  Giris basarisiz, sifrenizi yenilemek istiyorsaniz \"yes\"" +
                    "  istemiyorsaniz \" no\"  secenegini seciniz  ");
            sifirlama=input.nextLine();

            if( sifirlama.equals("no")){
                System.out.println(" giris sonlandirildi ");}

            else if (sifirlama.equals("yes")) {
                System.out.println(" yeni sifrenizi giriniz ");
                newPassword=input.nextLine();

                if( newPassword.equals("java123")|| newPassword.equals(password)){
                    System.out.println(" Hatali giris tekrar deneyiniz ");
                }
                else{
                    System.out.println(" sifrenizi basariyla yenilendi ");

                }

            }
            else{
                System.out.println(" hatali giris yaptiniz,lutfen sifrenizi giriniz ");

            }

        }
    }

}
