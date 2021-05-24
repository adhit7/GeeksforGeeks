package com.strings;

public class Anagram {
    public static boolean Anagram(String a,String b)
    {

        // Your code here
        int c = 0;
        int d = 0;
        if (a.length() != b.length()){
            return false;
        }
        for(int i = 0; i<a.length(); i++){
            c += a.charAt(i);
            d += b.charAt(i);
        }
        if (c != d){
            return false;
        }
        else{
            return true;
        }


    }
    public static void main(String[] args) {
        System.out.println(Anagram("abc","cba"));
    }
}
