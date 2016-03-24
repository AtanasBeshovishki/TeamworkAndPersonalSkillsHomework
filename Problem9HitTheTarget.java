package com.company;

import  java.util.*;
public class Problem9HitTheTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (j + i == input ){
                    System.out.printf("%d + %d = %d\n",i , j, input );
                }
            }
        }
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (j - i == input){
                    System.out.printf("%d - %d = %d\n",j ,i, input);
                }else if(i - j == input){
                    System.out.printf("%d - %d = %d\n",i ,j, input);
                }
            }

        }
    }
}
