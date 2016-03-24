package com.company;

import java.util.*;

public class Problem3FormattingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());
        System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", a, String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0'), b, c);
    }

}
