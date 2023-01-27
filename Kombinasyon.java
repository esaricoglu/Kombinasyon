package Donguler;

import java.util.Scanner;

public class Kombinasyon {
    /*Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)*/
    public static void main(String[] args) {
        int n, r;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kümedeki eleman sayısını giriniz: ");
        n = inp.nextInt();
        System.out.println("Grupların kaç elemanlı olacağını giriniz: ");
        r = inp.nextInt();

        int x = (n - r);
        int factorialN = 1;
        int factorialR = 1;
        int factorialF = 1;

        for (int i = 1; i <= n; i++) {
            factorialN *= i;
        }
        for (int i = 1; i <= r; i++) {
            factorialR *= i;
        }
        for (int i = 1; i <= x; i++) {
            factorialF *= i;

        }
        System.out.println(n + "\'in " +r+ "\'li kombinasyonu = "+ (factorialN/(factorialR*factorialF)) );
    }
}