package org.example.easy;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeTwoSortedList {

    public static void main(String[] args) {
        MergeTwoSortedList m =new MergeTwoSortedList();
        ListNode l1= new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);

        ListNode l2= new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
        ListNode l=m.mergeTwoLists(l1,l2);
        m.printList(l);

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
          ListNode head=new ListNode();
          ListNode l=head;
        while(
                (list1!=null)||
                (list2!=null)
        ){
            if (list1==null) {
                l.next = new ListNode(list2.val);
                list2 = list2.next;
                l=l.next;
                continue;
            }else if (list2==null){
                l.next=new ListNode(list1.val);
                list1=list1.next;
                l=l.next;
                continue;
            }


            if (list1.val<list2.val){
                l.next=new ListNode(list1.val);
                list1=list1.next;
            }
            else if ( list1.val>list2.val){
                l.next=new ListNode(list2.val);
                list2=list2.next;
            }else if(list1.val==list2.val){
                // equal case
                System.out.println("equal case");
                l.next=new ListNode(list2.val);
                l=l.next;
                l.next=new ListNode(list2.val);
                list2=list2.next;
                list1=list1.next;
            }
            l=l.next;
        }
        return head.next;
    }

    public  void printList(ListNode l){
        if (l!=null){
            System.out.println(l.val);
            printList(l.next);
        }
    }
}
