package patikaDev101;

import java.util.Scanner;

public class HipotenusBulma {

        public static void main(String[] args) {
            int a,b,c;
            double u,cevre,alan;

            Scanner input = new Scanner(System.in);

            System.out.println("1. Kenari Giriniz: ");
            a = input.nextInt();

            System.out.println("2. Kenari Giriniz: ");
            b = input.nextInt();

            System.out.println("3. Kenari Giriniz: ");
            c = input.nextInt();

            u = (a+b+c)/2.0;
            cevre = 2*u;
            alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

            System.out.println("Uçgenin Cevresi: " +cevre);
            System.out.println("Uçgenin Alani: " +alan);







        }
    }

