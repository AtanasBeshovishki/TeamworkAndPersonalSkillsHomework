package com.company;

import java.lang.*;
import java.util.*;

public class Problem11GetFirstOddOrEvenElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split(" ");
        String[] gets = sc.nextLine().split(" ");

        System.out.println(getsElemens(nums, gets));
    }

    static String getsElemens(String[] nums, String[] gets) {

        int howGet = Integer.parseInt(gets[1]);
        String result = "";
        String oddOrEven = gets[2];
        if (nums.length >= howGet) {
            for (int i = 0; i < nums.length; i++) {
                int intNum = Integer.parseInt(nums[i]);
                if ((intNum % 2 != 0) && (oddOrEven.equals("odd"))) {
                    result += nums[i] + " ";
                    howGet--;
                    if (howGet == 0) {
                        break;
                    }
                }else if ((intNum % 2 == 0) && (oddOrEven.equals("even"))){
                    result += nums[i] + " ";
                    howGet--;
                    if (howGet == 0) {
                        break;
                    }
                }
            }
        }else {
            for (int i = 0; i < nums.length; i++) {
                int intNum = Integer.parseInt(nums[i]);
                if ((intNum % 2 != 0) && (oddOrEven.equals("odd"))) {
                    result += nums[i] + " ";
                }else if ((intNum % 2 == 0) && (oddOrEven.equals("even"))){
                    result += nums[i] + " ";
                }
            }
        }
        return result;
    }
}
