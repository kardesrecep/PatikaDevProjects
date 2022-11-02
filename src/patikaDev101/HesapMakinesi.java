package patikaDev101;

import java.util.Scanner;

public class HesapMakinesi {

        public static void main(String[] args) {
            int number1 , number2 , choose;
            Scanner scan= new Scanner(System.in);
            System.out.println( "Birinci sayiyi giriniz");
            number1= scan.nextInt();

            System.out.println( "Ikinci sayiyi giriniz");
            number2= scan.nextInt();

            System.out.println("""
                     toplama islemi icin 1
                     cikarma islemi icin 2
                     carpma islemi icin 3
                     bolme islemi icin 4\s""");

            System.out.println( " Lutfen seciminizi yapiniz : ");
            choose= scan.nextInt();

            switch (choose) {
                case 1 :
                    System.out.println( "Sonuc : " + (number1 + number2));
                    break;
                case 2 :
                    System.out.println( "Sonuc : " + (number1 - number2));
                    break;
                case 3 :
                    System.out.println( "Sonuc : " + (number1 * number2));
                    break;
                case 4 :
                    if (number2 != 0){
                        System.out.println(number1 / number2);
                    }
                    else {
                        System.out.println("0 bolunmez");
                    }
                    break;
                default :

                    System.out.println("Yanlis secim yaptiniz, lutfen dogru bir secim yapiniz");


            }

        }
    }

