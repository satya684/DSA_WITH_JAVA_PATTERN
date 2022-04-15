package com.satya;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int index = 1;
        for(int i = index; i <= 10; i++){
            System.out.println(n + "*" + i + "=" + (n * i));
//            System.out.println(n * index);
        }
        System.out.println();


    }
}
