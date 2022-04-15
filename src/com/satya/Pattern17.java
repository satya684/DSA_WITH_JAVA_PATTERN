package com.satya;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        /*Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = 2 * n - 3;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= space; j++) {
                System.out.println("\t");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            star++;
            space -= 2;
            System.out.println();
        }*/

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 2 * n - 3;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= st; j++) {
                System.out.print( val + "\t");
                val++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if (i == n) {
                st--;
                val--;
            }
            for (int j = 1; j <= st; j++) {
                val--;
                System.out.print(val + "\t");
            }
            st++;
            sp -= 2;
            System.out.println();
        }
    }
}
