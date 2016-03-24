package com.company;

import  java.util.*;
import  java.lang.*;

public class Problem4CalculateExpression {
    public static void main(String[] args) {
        System.out.println("Enter three floating point numbers:");
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());

        double firstFPow = ((a + b + c) / Math.sqrt(c));
        double first = (Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2));
        double firstF = Math.pow(first, firstFPow);

        double secondFPow = a - b;
        double second = Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3);
        double secondF = Math.pow(second, secondFPow);

        double averageNums = (a + b + c) / 3;
        double averageFs = (firstF + secondF) / 2;

        double different;

        if (averageNums > averageFs) {

            different = averageNums - averageFs;

        } else {
            different = averageFs - averageNums;
        }
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstF, secondF, different);
    }
}
