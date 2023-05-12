package org.example.easy;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010","1011"));
    }
    public static String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0; int []w=new int[3];
        String res="";
        while (i>=0 || j>=0){
            int sum=carry;
            if (i>=0) sum+=a.charAt(i--)- '0';
            if (j>=0) sum+=b.charAt(j--)- '0';

            System.out.println(sum);
            res=sum%2+res;
            carry=sum/2;
        }
        if (carry!=0) res='1'+res;

        return res;
    }

}
