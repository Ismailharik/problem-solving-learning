package org.example.sorts;

public class InsertionSort {

    //We use interface comparable to make it compare All objects whatever it's type

    public static void sort(Comparable[] a ){
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j >0 ; j--) {
                if(less(a[j-1],a[j])){
                    exch(a,j-1,j);
                }else{
                    break;
                }
            }
        }
    }

    public static boolean less(Comparable a , Comparable b) {
        return a.compareTo(b)>0;
    }
    public static void exch(Comparable[]a ,int i,int j){
        Comparable swap = a[i];
        a[i]=a[j];
        a[j]=swap;
    }
}
