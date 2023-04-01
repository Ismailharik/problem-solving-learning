package org.example.sorts;

import java.util.List;

public class MainSorts {
    public static void main(String[] args) {

        System.out.println("-----------Sort Strings-----------");
        Comparable[] arrString = {"1","2","3","7","1","9"};
        SelectionSort.sort(arrString);
        for (int i = 0; i < arrString.length; i++) {
            System.out.println(arrString[i]);
        }
        System.out.println("-----------Sort Integers -----------");

        Comparable[] a = {1,2,3,7,1,9};
        SelectionSort.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        Comparable[] dates = {
                new Date(1, 20, 30),
                new Date(2, 30, 40),
                new Date(2, 20, 60),
                new Date(4, 50, 0),
                new Date(0, 20, 30)
        };

        System.out.println("--------- Sorting Dates  ----------");
        SelectionSort.sort(dates);
        for (int i = 0; i <dates.length ; i++) {
            System.out.println(dates[i]);
        }
    }
}
