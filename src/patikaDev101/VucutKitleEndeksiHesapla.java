package patikaDev101;

import java.util.Scanner;

public class VucutKitleEndeksiHesapla {

    public static void main(String[] args) {
        double boy, kilo, formul;


        Scanner input = new Scanner(System.in);


        System.out.println("Boyunuzu Metre Cinsinden Giriniz: ");
        boy = input.nextDouble();

        System.out.println("Kilonuzu Kilogram Cinsinden Giriniz: ");
        kilo = input.nextDouble();


        formul = kilo/(Math.pow(boy,2));

        System.out.println("Vücut Kitle Endeksiniz: " +formul);







    }
}

