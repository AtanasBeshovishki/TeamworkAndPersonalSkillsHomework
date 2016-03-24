package com.company;

import java.util.*;

public class Problem7RandomizeNumbersFromNToM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int bigg = 0;
        int small = 0;

        if (n > m) {
            bigg = n;
            small = m;
        } else {
            bigg = m;
            small = n;
        }
        List<Integer> rndNums = new ArrayList<>();

        for (int i = small; i <= bigg; i++) {
            rndNums.add(i);
            Collections.shuffle(rndNums);
        }
        for (int item : rndNums) {
            System.out.printf("%s ", item);
        }
    }
}
