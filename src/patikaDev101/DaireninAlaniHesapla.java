package patikaDev101;

import java.util.Scanner;

public class DaireninAlaniHesapla {
    public static void main(String[] args) {
        int r,a;
        double pi=3.14, formul;
        Scanner input = new Scanner(System.in);

        System.out.println("Yaricapi giriniz: ");
        r = input.nextInt();

        System.out.println("Merkez aci olcusunu giriniz: ");
        a = input.nextInt();


        formul = (pi*(Math.pow(r,2))*a)/360;

        System.out.println("Merkez aci olculu daire diliminin alani: " +formul);







    }
}

