package com.satya;

import java.util.Scanner;

public class Another {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int ss = s;
        for (int i = 1; i <= s; i++){
            for (int j = 1; j <= ss; j++){
                System.out.print("* ");
            }
            ss--;
            System.out.println();
        }
    }
}
