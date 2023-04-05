package org.example.sorts;

public class ShellSort {
   public static void sort(Comparable[] a){
       int N=a.length;
       int h=1;
       while (h<N/3) h=3*h+1; // 1,4,13,40,121,364 ...

       while (h>=1){
           // h-sort the array
           for (int i = 0; i < N; i++) {
               for (int j = i; j >=h && less(a[j], a[j-h]); j-=h) {
                   exch(a,j,j-h);
               }
           }
        h=h/3;
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
