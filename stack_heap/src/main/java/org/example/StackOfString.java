package org.example;

public class StackOfString {
        private Node first;
    class Node {
        String data;
        Node next=null;
        public Node(String item){
            this.data = item;
        }
    }
    public void push(String item){
        Node newNode = new Node(item);
       if(isEmpty()){
           first=newNode;
       }else{
           newNode.next=first;
           first= newNode;
       }
    }
    public String pop(){
        String item=first.data;
        first = first.next;
        return item;
    }
    public boolean isEmpty(){
            return null==this.first;
    }

}
