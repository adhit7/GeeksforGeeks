package Arrays;

public class ReverseString {
    public static String reverseWord(String s)
    {
        // Reverse the string str
        String rs = "";
        for(int i = s.length()-1; i >= 0; i--){
            rs += s.charAt(i);
        }
        return rs;
    }
    public static void main(String[] args) {
        System.out.println(reverseWord("arjun"));
    }
}
