package org.example.algoExpert;

import java.util.HashMap;
import java.util.Map;

public class twoNumberSum {
    public static void main(String[] args) {

        int []a=twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6},10);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
//        A[i] +A[j]=targetSum;
//        A[j]=targetSum-A[i]
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            int b=targetSum-array[i];
            if(map.containsKey(b)){

                return new int[]{b,array[i]};
            }else{
                map.put(array[i],i);
            }
        }

        return new int[0];
    }
}
