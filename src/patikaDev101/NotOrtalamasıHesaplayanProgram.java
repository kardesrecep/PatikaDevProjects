package patikaDev101;

import java.util.Scanner;

public class NotOrtalamasıHesaplayanProgram {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner input= new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Turkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double a = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.print("Not Ortalamanız : ");
        System.out.println(a);

        String durum = a > 60 ? "Geçtiniz" : "Kaldınız";
        System.out.println(durum);





    }
}


