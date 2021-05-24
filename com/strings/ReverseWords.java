package com.strings;

public class ReverseWords {
    public static String reverseWords(String S)
    {
        // code here
        String[] strs = S.split("\\.");
        String newStr = "";

        for(int i = strs.length - 1; i >= 0; i--) {
            if(i == 0){
                newStr += strs[i];
            }else {
                newStr += strs[i] + ".";
            }
        }

        return newStr;

    }
    public static void main(String[] args) {
        System.out.println(reverseWords("i.much.strings"));
    }
}
