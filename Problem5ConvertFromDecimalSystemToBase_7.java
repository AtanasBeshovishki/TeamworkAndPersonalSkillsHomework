package com.company;

import java.util.*;

public class Problem5ConvertFromDecimalSystemToBase_7 {
    public static void main(String[] args) {

        System.out.println("Enter the number you want to convert to base 7:");
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        String convert_7 = Integer.toString(num, 7);

        System.out.println(convert_7);
    }
}
