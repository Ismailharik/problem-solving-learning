package org.example.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TreeSum3 {
    public static void main(String[] args) {

    int[] nums = new int[]{};
        long start2 = System.currentTimeMillis();
        System.out.println(threeSum(nums).toString());
        long end2 = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (end2-start2));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Map<List<Integer>, Integer> map2 = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j+1; k <nums.length ; k++) {
                    int sum=nums[i]+nums[j]+nums[k];
                    if (sum==0)
                    map2.put(List.of(nums[i],nums[j],nums[k]),nums[i]+nums[j]+nums[k] );
                }
            }
        }
                return map2.keySet().stream().toList();
    }


}
