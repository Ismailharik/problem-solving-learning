package org.example.easy;

public class MaxArrRec {
    public static void main(String[] args) {
        int[] arr =new int[]{8,1,5,2,7};
        String s="";
        System.out.println(findMaxArrRec(arr,0,arr[0]));
    }

    public static int findMaxArrRec(int[]arr,int i,int max){
        if (i==arr.length) return max;
        if(arr[i]>max){
            max=arr[i];
        }
        return findMaxArrRec(arr,i+1,max);
    }
}
