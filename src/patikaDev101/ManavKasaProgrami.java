package patikaDev101;

import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {
        double armut = 2.14,
                elma = 3.67,
                domates = 1.11,
                muz = 0.95,
                patlican = 5.00;

        double a, b, c, d, e, fiyat;


        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kilosunu Giriniz: ");
        a = input.nextDouble();

        System.out.println("Elma Kilosunu Giriniz: ");
        b = input.nextDouble();

        System.out.println("Domates Kilosunu Giriniz: ");
        c = input.nextDouble();

        System.out.println("Muz Kilosunu Giriniz: ");
        d = input.nextDouble();

        System.out.println("Patlıcan Kilosunu Giriniz: ");
        e = input.nextDouble();


        fiyat = (armut * a) + (elma * b) + (domates * c) + (muz * d) + (patlican * e);

        System.out.println("Toplam Ücret: " + fiyat);


    }
}



