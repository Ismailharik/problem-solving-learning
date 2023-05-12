package org.example.medium;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {
    public static void main(String[] args) {
        maxSubArray(new int[]{-2,-3,-4});
    }

    public static   int maxSubArray(int []nums){

        int currentSum=0;
        int sum=Integer.MIN_VALUE;
        for( int i=0; i<nums.length;i++){
            if(currentSum<0){
                currentSum=0;
            }
            currentSum+=nums[i];
            sum=Math.max(currentSum,sum);
        }
        System.out.println(sum);
        return sum;
    }
}
