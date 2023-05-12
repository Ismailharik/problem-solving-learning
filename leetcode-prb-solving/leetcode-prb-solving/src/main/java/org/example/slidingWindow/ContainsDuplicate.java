package org.example.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

//    Given an integer array nums and an integer k,
//    return true if there are two distinct indices i and j
//    in the array such that nums[i] == nums[j] and abs(i - j) <= k
//    Example 1:
//
//    Input: nums = [1,2,3,1], k = 3
//    Output: true
//    Example 2:
//
//    Input: nums = [1,0,1,1], k = 1
//    Output: true
//    Example 3:
//
//    Input: nums = [1,2,3,1,2,3], k = 2
//    Output: false

//    Constraints:
//
//            1 <= nums.length <= 105
//            -109 <= nums[i] <= 109
//            0 <= k <= 105
public static void main(String[] args) {
    int[] nums = new int[]{1,2,3,1,2,3};
    int k=2;
    System.out.println(containsNearbyDuplicate(nums,k));

    //1-0
    //2-1
    //3-2
    //1-3
    //1-0
}
public static boolean containsNearbyDuplicate(int[] nums, int k) {
    //I should check each num in the arr if it's equal to other element first
    //then I should che if it's indices abs(i-j)<k


    int max1= (int) Math.pow(10,5);
    int max2= (int) Math.pow(10,9);
    if (k==0) return false;
    Map<Integer,Integer> slidingWindow=new HashMap<>();
    if (
            (1 > nums.length || nums.length > max1 )&&
                    (0 > k || k  > max1)
    ){
            return false;
    }
    for (int i = 0; i < nums.length ; i++) {
        int tmp1 = nums[i];

        if (
                (-max2 <= nums[i] &&  nums[i]<= max2) &&
                (slidingWindow.containsKey(tmp1)) &&
                (i-slidingWindow.get(tmp1) <= k)
        ) {
            return true;
        }
        slidingWindow.put(tmp1,i);
    }
    return false;
}
}
