package com.strings;

import java.util.HashSet;

public class LongestSubstring {
    public static int SubsequenceLength(String s)
    {
        int n = s.length(), ans = 0;
        int[] index = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(SubsequenceLength("geeksforgeeks"));
    }
}
