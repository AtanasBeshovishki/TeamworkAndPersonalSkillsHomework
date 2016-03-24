package com.company;

import java.util.*;

public class Problem2TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aInput = sc.nextLine();
        String[] a = aInput.split(" ");
        String bInput = sc.nextLine();
        String[] b = bInput.split(" ");
        String cInput = sc.nextLine();
        String[] c = cInput.split(" ");

        int x1 = Integer.parseInt(a[0]);
        int y1 = Integer.parseInt(a[1]);
        int x2 = Integer.parseInt(b[0]);
        int y2 = Integer.parseInt(b[1]);
        int x3 = Integer.parseInt(c[0]);
        int y3 = Integer.parseInt(c[1]);

        double aB = Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);
        double bC = Math.sqrt((x3 - x2) * 2 + (y3 - y2) * 2);
        double cB = Math.sqrt((x1 - x3) * 2 + (y1 - y3) * 2);

        int area = (int) (0.5 * ((x1 - x2) * (y1 + y2) + (x2 - x3) * (y2 + y3) + (x3 - x1) * (y3 + y1)));

        if(area>0){

        System.out.println(area);

        } else{

        System.out.println(area * -1);

        }
    }
}
