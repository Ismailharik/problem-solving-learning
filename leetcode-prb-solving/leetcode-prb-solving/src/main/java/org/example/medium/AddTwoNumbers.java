package org.example.medium;

import java.util.List;

public class AddTwoNumbers {
//    You are given two non-empty linked lists representing two non-negative integers.
//    The digits are stored in reverse order, and each of their nodes contains a single digit.
//    Add the two numbers and return the sum as a linked list.
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Example
//    Input: l1 = [2,4,3], l2 = [5,6,4]
//    Output: [7,0,8]
//    Explanation: 342 + 465 = 807.

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        AddTwoNumbers atn = new AddTwoNumbers();
        atn.initializeData();

    }

    public void initializeData() {
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode lSum,l3;
        l1 = addNode(l1, 2);
        addNode(l1, 4);
        addNode(l1, 3);

        l2 = addNode(l2, 5);
        addNode(l2, 6);
        addNode(l2, 4);

        l3=lSum=new ListNode(0);
        int carry=0;

        //I will get all nodes data and store them as int for num1 for l1 , num2 for l2
        //Then I will make a sum of both of them and then refactor data in a linkedList
        //I used this solution, and it works, but it can't work when numbers get too longer

        /*
        * As you see in the example above , to calculate the sum you should reverse the list then add sum of numbers
        * But when we start the sum start from left it's a new reverse of elements
        * So the reverse of the reverse get back to the first point
        * */
        while (l1!=null || l2!=null||carry==1){
            int sum=0;
            if (l1!=null){
                sum+=l1.val;
                l1= l1.next;
            }
            if (l2!=null){
                sum+=l2.val;
                l2= l2.next;
            }
            if (carry==1){
                sum+=1;
                carry=0;
            }
            if (sum>9){
                sum=sum%10;
                carry=1;
            }
            lSum.next=new ListNode(sum);// but the sum can be greater one number ( each node should contain one num )
            lSum=lSum.next;
        }
        printList(l3.next);

    }

    public ListNode addNode(ListNode l, int val) {
        if (l == null) {
            return l = new ListNode(val);
        } else if (l.next != null) {
            addNode(l.next, val);
        } else {
            l.next = new ListNode(val);
        }
        return l;
    }

    public void printList(ListNode l) {
        if (l != null) {
            System.out.println(l.val);
            printList(l.next);
        }
    }

}
