package org.example.sorts;

public class SelectionSort {

    //We use interface comparable to make it compare All objects whatever it's type

    public static void sort(Comparable[] a ){
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j <N ; j++) {
                if(less(a[min],a[j])){
                min = j;
                }
            }
            exch(a,i,min);
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
