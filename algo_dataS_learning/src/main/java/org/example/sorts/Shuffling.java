package org.example.sorts;

public class Shuffling {

    public static void Shuffle(Comparable[] a){
        int N = a.length;
        for (int i = 0; i < N; i++) {
            //generate random number between 1 & i ,  you can use range between 0 and N , but It won't give
            // you a uniform random result
            int r  = (int) (Math.random()*i);

            System.out.println("the random number is : "+r);
            exch(a,i,r);
        }
    }

    public static void exch(Comparable[]a ,int i,int j){
        Comparable swap = a[i];
        a[i]=a[j];
        a[j]=swap;
    }
}
