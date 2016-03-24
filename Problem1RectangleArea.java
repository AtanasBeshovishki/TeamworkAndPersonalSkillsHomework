package com.company;

import java.util.*;

public class Problem1RectangleArea {

    public static void main(String[] args) {
        System.out.println("Enter the sides of the rectangle:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        int a = Integer.parseInt(inputArr[0]);
        int b = Integer.parseInt(inputArr[1]);

        int area = a * b;

        System.out.println(area);
    }
}
