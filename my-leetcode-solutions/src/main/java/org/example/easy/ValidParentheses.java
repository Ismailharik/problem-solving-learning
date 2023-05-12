package org.example.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses{

    public static void main(String[] args) {
        System.out.println(isValid("()"));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){

            if (!stack.isEmpty()){
                if(
                        stack.get( stack.size()-1) =='(' && s.charAt(i)==')'||
                                stack.get(stack.size()-1) =='{' && s.charAt(i)=='}'||
                                stack.get(stack.size()-1) =='[' && s.charAt(i)==']'
                ){
                        stack.pop();
                }else {
                    stack.add(s.charAt(i));
                }
            }else {
                stack.add(s.charAt(i));
            }

        }
        return stack.isEmpty();
    }
}
