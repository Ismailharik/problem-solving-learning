package org.example.stackQueue.generics;

public class GenericQueue<Item> {
        private Node first,last;
    class Node {
        Item data;
        Node next=null;
        public Node(Item item){
            this.data = item;
        }
    }
    public void enqueue(Item item){
        Node newNode = new Node(item);
       if(isEmpty()){
           first=last=newNode;
       }else{
           last.next=newNode;
           last = newNode;
       }
    }
    public Item deQueue(){
        Item item=first.data;
        first = first.next;
        return item;
    }
    public boolean isEmpty(){
            return null==this.first;
    }

}
