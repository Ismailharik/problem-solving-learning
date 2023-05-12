package org.example;

public class reverseInteger {

    public static void main(String[] args) {
        System.out.println(reverseInteger(1534236469));
        System.out.println(reverseInteger(123));
        System.out.println(1534236469>Math.pow(2,31)-1);

        System.out.println(reverseInteger(-2147483412));

    }

    private static int reverseInteger(int x) {
        boolean tmp=false;
//        int x =123;
        //x%10 =3 , x/10=12 & x%10=2, x/10=1 & x%10=1
        long y=0;
        if(x<0){
            tmp=true;
            x*=-1;
        }
        while(x>0){
            y=y*10+x%10;
            x/=10;
        }
        if (y>Integer.MAX_VALUE || y<-Integer.MIN_VALUE ) return 0;
        if (tmp) y*=-1;
        return (int) y;
    }
}
