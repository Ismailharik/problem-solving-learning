package org.example.medium;

import java.util.*;

public class TreeSumPro {
    public static void main(String[] args) {

        int[] nums = new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        long start2 = System.currentTimeMillis();
        System.out.println(threeSum(nums).toString());
        long end2 = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (end2-start2));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        Arrays.stream(nums).forEach(value -> System.out.println(value));
        for (int i = 0; i < nums.length - 2; i++) {
            int j=i+1;
            int k=nums.length-1;

            while (j<k){
                int sum=nums[i]+nums[j]+nums[k];
            if (sum==0){
                set.add(List.of(nums[i],nums[j++],nums[k--]));
            }else if(sum<0){
                j++;
            }else  if(sum>0){
                k--;
            }
            }
        }


        return new ArrayList<>(set);
    }


}
