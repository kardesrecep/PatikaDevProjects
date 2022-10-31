package patikaDev101;

import java.util.Scanner;

public class KdvHesapla {

        public static void main(String[] args) {
            double para;
            double kdvli, kdvTutar;

            Scanner tutar = new Scanner(System.in);

            System.out.println("Para Tutarını Giriniz");
            para = tutar.nextInt();

            if (para>=0 && para<=1000 ) {
                kdvTutar = (para*18)/100;
                kdvli = kdvTutar +para;
            }
            else {
                kdvTutar = (para*8)/100;
                kdvli = kdvTutar +para;
            }

            System.out.println("KDV\'siz Fiyat: " +para);
            System.out.println("KDV\'li Fiyat: " +kdvli);
            System.out.println("KDV Tutarı: " + kdvTutar);

        }
    }



