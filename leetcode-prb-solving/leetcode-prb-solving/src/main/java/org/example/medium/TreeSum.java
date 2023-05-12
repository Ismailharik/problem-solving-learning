package org.example.medium;

import java.util.*;
import java.util.stream.Collectors;

public class TreeSum {
    public static void main(String[] args) {

        int[] nums = new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        long start2 = System.currentTimeMillis();
        System.out.println(threeSum(nums).toString());
        long end2 = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (end2-start2));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        Map<List<Integer>, Integer> map2 = new HashMap<>();
        Map<Integer, Integer> map3 = new HashMap<>();


        for (int i = 0; i < nums.length - 1; i++) {
            map3.put(nums[i], i);
            for (int j = i + 1; j < nums.length; j++) {
                map.put(List.of(i, j),nums[i]+nums[j] );
            }
        }
        // a+b+c=0; c=-(a+b)
        map.forEach((k, v) -> {
            int i1 = k.get(0);
            int i2 = k.get(1);
            if (map3.containsKey(-v)){
                int indexC=map3.get(-v);
                if (i1 != i2 && i2 != indexC && i1 != indexC){
                    List<Integer> newList = List.of(nums[i1], nums[i2], -v).stream().sorted().toList();
                    map2.put(newList, 0);
                }
            }
        });

        return map2.keySet().stream().toList();
    }


}
