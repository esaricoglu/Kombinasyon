package Donguler;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kümedeki eleman sayısını giriniz : ");
        n = inp.nextInt();
        System.out.print("Grupların kaç elemanlı olacağını giriniz : ");
        r = inp.nextInt();
        
        int factorialN = 1;
        int factorialR = 1;
        int factorialF = 1;

        for (int i = 1; i <= n; i++) {
            factorialN *= i;
        }
        for (int i = 1; i <= r; i++) {
            factorialR *= i;
        }
        for (int i = 1; i <= (n-r); i++) {
            factorialF *= i;

        }
        System.out.println(n + "\'in " +r+ "\'li kombinasyonu = "+ (factorialN/(factorialR*factorialF)) );
    }
}
