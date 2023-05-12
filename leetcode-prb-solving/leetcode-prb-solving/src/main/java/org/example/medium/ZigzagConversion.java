package org.example.medium;

import java.util.HashMap;
import java.util.Map;


public class ZigzagConversion {

//    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
//    (you may want to display this pattern in a fixed font for better legibility)
//    P   A   H   N
//    A P L S I I G
//    Y   I   R


    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        convert(s, 4);

    }

    public static String convert(String s, int numRows) {
        int size = s.length();
        int i = 0, j = 0;

        boolean up = true;
            int t = 0;
        Map<Integer, String> map = new HashMap<>();
        while (t < size) {

            if (map.get(i) == null) {

            map.put(i, String.valueOf(s.charAt(t++)));
            }else{
                map.put(i,map.get(i)+s.charAt(t++));
            }

            if (up) {
                i++;
            } else {
                i--;
                j++;
            }
            if (i == numRows - 1) {
                up = false;
            }
            if (i == 0) {
                up = true;
            }
        }
        String result="";
        for (String subS: map.values()) {
            result+=subS;
        }
        return result;
    }
}
