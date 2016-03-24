package com.company;

import java.util.*;
import java.lang.*;

public class Problem8OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] nums = input.split(" ");

        List<Integer> inArr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            inArr.add(Integer.parseInt(nums[i]));
        }
        if (inArr.size() % 2 != 0) {
            System.out.println("Invalid length");
            System.exit(0);
        }
        for (int i = 0; i < inArr.size(); i += 2) {
            if ((inArr.get(i) % 2 != 0) && (inArr.get(i + 1) % 2 != 0)){
                System.out.printf("%d, %d -> both are odd\n", inArr.get(i), inArr.get(i + 1));
            }else if(((inArr.get(i) % 2 != 0) && (inArr.get(i + 1) % 2 == 0))){
                System.out.printf("%d, %d -> different\n", inArr.get(i), inArr.get(i + 1));
            }else {
                System.out.printf("%d, %d -> both are even\n", inArr.get(i), inArr.get(i + 1));
            }
        }
    }
}
