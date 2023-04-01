package org.example.iterators;

import java.util.Iterator;


public class IteratingQueue<Item> implements Iterable<Item> {
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

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

private class ListIterator implements Iterator {

    private Node current = first;
    @Override
    public boolean hasNext() {
        return current!=null;
    }

    @Override
    public Object next() {
        Item item = current.data;
        current = current.next;
        return item;
    }
}
}
