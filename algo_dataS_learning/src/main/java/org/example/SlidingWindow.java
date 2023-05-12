package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SlidingWindow {
    public static void main(String[] args) {
// input:  2, 4, 4,    3,5…
// window: 3

// output: 2, 3, 3.33, 3.67, 4…

// Iterator<T> : next() -> T
//               : hasNext() -> boolean
//

        List<Long> data = Arrays.asList(2L, 4L, 4L, 3L, 5L);
        Iterator<Long> it = data.iterator();
        int window = 3;

        printRunningAvg(it, window);

    }
    public static void printRunningAvg(Iterator<Long> it, int window) {
        Double sum=0.0;
        int i=0;
        Long subArr[]=new Long[window];

        while(it.hasNext() && i<window-1){
            sum+=subArr[i]=it.next();
            System.out.println(sum/(++i));
        }

        while (it.hasNext()) {
            shiftLeft(subArr);
            subArr[window - 1] = it.next();
            sum += subArr[window - 1];
            System.out.println(sum / window);
        }

    }
    public static void shiftLeft(Long[] subArr){

        for (int i = 0; i < subArr.length-1; i++) {
            subArr[i]=subArr[i+1];
        }

    }
}
