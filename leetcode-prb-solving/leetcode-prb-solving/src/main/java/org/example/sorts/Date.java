package org.example.sorts;

public class Date implements Comparable {
    int hr;
    int min;
    int sec;

    public Date(){}

    public Date(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    @Override
    public int compareTo(Object o) {
        Date d = (Date) o;
        if(this.hr>d.hr){
            return 1;
        }else if (this.hr==d.hr){
            if (this.min>d.min){
                return 1;
            }else if (this.min==d.min){
                if (this.sec>d.sec){
                    return 1;
                }else if(this.sec<d.sec){
                    return -1;
                }else{
                    return 0;
                }
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        return "Date{" +
                "hr=" + hr +
                ", min=" + min +
                ", sec=" + sec +
                '}';
    }
}
