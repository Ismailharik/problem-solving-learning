package org.example.stackQueue;

class PriorityQueue<T> {
    Node head = new Node();

    class Node {
        T data;
        int priority;
        Node next;

        public Node(T data, int priority) {
            this.data = data;
            this.priority = priority;
            this.next = null;
        }

        public Node() {
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", priority=" + priority +" }";

        }
    }


    public void push( T data, int priority) {
        Node tmp = this.head;
        Node node = new Node(data, priority);
        if (tmp.next == null) {
            tmp.next = node;
            return;
        }

        while (tmp.next != null && tmp.next.priority <= priority) {
            tmp = tmp.next;
        }
        if (tmp.next != null) {
            node.next = tmp.next;
            tmp.next = node;
        } else {
            tmp.next = node;
        }
    }
    public void pop(){

        if (head.next==null){// head will never be null ,
            System.out.println("empty Queue");
        }else{
            head.next=head.next.next;
        }
    }

    public void printList(Node head) {
        if (head != null) {
            System.out.println("data : " + head.data + "priority : " + head.priority);
            printList(head.next);
        }

    }
}

public class PriorityQueueMain {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.push( 1, 1);
        priorityQueue.push( 4, 1);
        priorityQueue.push( 5, 2);
        priorityQueue.push( 2, 2);
        priorityQueue.push( 4, 6);
        priorityQueue.push( 5, 6);
        priorityQueue.push( 6, 2);

        // pop should remove element with based on there priority 1 then 2 ...
//        priorityQueue.pop();



        priorityQueue.printList(priorityQueue.head.next);

    }




}
