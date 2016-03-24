package com.company;

import java.util.*;

public class Problem6ConvertFromBase_7ToDecimal {
    public static void main(String[] args) {

        System.out.println("Enter the number you want to convert to decimal system:");
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine(), 7);

        String convertDecimal = Integer.toString(num, 10);

        System.out.println(convertDecimal);
    }
}
