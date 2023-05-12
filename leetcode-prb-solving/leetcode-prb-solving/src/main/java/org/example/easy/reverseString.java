package org.example.easy;

public class reverseString {

    public static void main(String[] args) {
        System.out.println(reverse("avc"));
    }
    public static String reverse(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        char c = str.charAt(str.length()-1);
        return  c+reverse(str.substring(0,str.length()-1));
    }
}
