package com.company;

import java.util.*;
import java.lang.*;

public class Problem10CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inArr = input.split(" ");

        if (inArr.length != 2) {
            System.out.print("Invalid text");
            System.exit(0);
        }
        String first = inArr[0];
        String second = inArr[1];

        System.out.print(charMultipl(first, second));
    }

    static int charMultipl(String first, String second) {
        int result = 0;
        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                result += first.charAt(i) * second.charAt(i);
            }
        } else if (first.length() > second.length()) {
            for (int i = 0; i < second.length(); i++) {
                result += first.charAt(i) * second.charAt(i);

            }
            for (int i = second.length(); i < first.length(); i++) {
                result += first.charAt(i);
            }
        } else {
            for (int i = 0; i < first.length(); i++) {
                result += first.charAt(i) * second.charAt(i);

            }
            for (int i = first.length(); i < second.length(); i++) {
                result += second.charAt(i);
            }
        }

        return result;
    }

}




