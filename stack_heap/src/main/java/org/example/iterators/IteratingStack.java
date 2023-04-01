package org.example.iterators;

import java.util.Iterator;

public class IteratingStack<Item> implements Iterable<Item> {
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
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator{
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            Item item = current.data;
            current = current.next;
            return item;
        }
        @Override
        public void remove(){
            // We Shouldn't remove element in the list whatever it's place in the List
        }
    }
}
