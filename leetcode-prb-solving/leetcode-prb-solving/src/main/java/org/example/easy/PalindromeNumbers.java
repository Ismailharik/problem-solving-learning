package org.example.easy;

public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
    }

//    public static boolean isPalindrome(int x) {
//        // x = 221
//        // reversedX = 122
//        if (x<0) return false;
//        int reversedX=reverseNumber(x);
//        while (x!=0){
//            if (x%10 ==reversedX%10){
//                x/=10;
//                reversedX/=10;
//            }else {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static int  reverseNumber(int x){
//        int reverse=0;
//        while (x!=0){
//            reverse= reverse*10+x%10;
//            x/=10;
//        }
//        return reverse;
//    }
public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        if (x<0)return false;
        int n=s.length();
    for (int i = 0; i < n/2; i++) {
        if (s.charAt(i)!=s.charAt(n-1-i)){
            return false;
        }
    }
            return true;
}
}
