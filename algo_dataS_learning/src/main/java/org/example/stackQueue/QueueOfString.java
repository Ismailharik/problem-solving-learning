package org.example.stackQueue;

public class QueueOfString {
        private Node first,last;
    class Node {
        String data;
        Node next=null;
        public Node(String item){
            this.data = item;
        }
    }
    public void enqueue(String item){
        Node newNode = new Node(item);
       if(isEmpty()){
           first=last=newNode;
       }else{
           last.next=newNode;
           last = newNode;
       }
    }
    public String deQueue(){
        String item=first.data;
        first = first.next;
        return item;
    }
    public boolean isEmpty(){
            return null==this.first;
    }

}
