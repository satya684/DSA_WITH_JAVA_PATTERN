package com.satya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("* ");
            for (int j = 0; j <= i; j++){
                System.out.println("");
            }
        }
    }
}
