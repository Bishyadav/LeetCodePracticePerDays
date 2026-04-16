package org.example;

import java.util.Arrays;

public class LongestCommonPrefixEasy {
    public static void main(String[] args) {

        String[] s = {"dog","racecar","car"};
        Arrays.sort(s);

        String s1 = s[0];
        String s2 = s[s.length - 1];

        String commonPrefix = "";
        int leng;

        if (s1.length() < s2.length()) {
            leng = s1.length();
        } else {
            leng = s2.length();
        }

        for (int i = 0; i < leng; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                commonPrefix = commonPrefix + s1.charAt(i);
            } else {
                break;
            }
        }

        System.out.println(commonPrefix);  // ✅ Fixed
    }
}