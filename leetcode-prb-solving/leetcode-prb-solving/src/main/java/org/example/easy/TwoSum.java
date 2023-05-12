package org.example.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
//        int[] resultArr = twoSumPositiveNumbers(arr, target); //this it's the best solution but it work only with nmbrs>0
//        System.out.println(resultArr[0]);
//        System.out.println(resultArr[1]);
        int[] resultArr =twoSum(arr,target);
//        System.out.println(resultArr[0]);
//        System.out.println(resultArr[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int []out=new int[2];
        for (int i = 0; i < nums.length; i++) {
            int b = target - nums[i];//nums[i]+num[j]=target => num[j]=target-nums[i] this means we need nums[j] to add it to nums[i]
            // to get target

            if (map.containsKey(b)) {
                System.out.println("j=" + map.get(b)+ " i=" + i  );
                out[0]=map.get(b);
                out[1]=i;

                System.out.println("out[0]="+out[0]+" out[1]="+out[1]);
            }else {
                map.put(nums[i],i);
            }
        }
        return  null;
    }

    public static int[] twoSumPositiveNumbers(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        long sum = 0;
        while (first < last) {
            sum = nums[first] + nums[last];
            if (sum == target) {
                System.out.println("found");
                return new int[]{first, last};
            } else if (sum > target) {
                if (nums[first] > nums[last]) {
                    first++;
                } else {
                    last--;
                }
            } else {
                if (nums[first] > nums[last]) {
                    last--;
                } else {
                    first++;
                }
            }
        }
        return new int[]{first + 1, first + 2};

    }
}
