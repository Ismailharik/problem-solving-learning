package org.example.generics;


public class GenericStack<Item> {
    private Node first;
    class Node {
        Item data;
        Node next=null;
        public Node(Item item){
            this.data = item;
        }
    }
    public void push(Item item){
        Node newNode = new Node(item);
        if(isEmpty()){
            first=newNode;
        }else{
            newNode.next=first;
            first= newNode;
        }
    }
    public Item pop(){
        Item item=first.data;
        first = first.next;
        return item;
    }
    public boolean isEmpty(){
        return null==this.first;
    }

}
