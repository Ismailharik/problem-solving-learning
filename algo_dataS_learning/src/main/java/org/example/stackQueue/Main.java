package org.example.stackQueue;

import org.example.datastructures.stackQueue.generics.GenericQueue;
import org.example.datastructures.stackQueue.generics.GenericStack;
import org.example.datastructures.stackQueue.iterators.IteratingQueue;
import org.example.datastructures.stackQueue.iterators.IteratingStack;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------- QUEUE -----------------------");

        QueueOfString queue = new QueueOfString();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

        System.out.println("--------------- STACK -----------------------");

        StackOfString stack = new StackOfString();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        System.out.println("---------------GENERIC QUEUE -----------------------");

        GenericQueue genericQueue = new GenericQueue();
        genericQueue.enqueue(1);
        genericQueue.enqueue(2);
        genericQueue.enqueue(3);
        System.out.println(genericQueue.deQueue());
        System.out.println(genericQueue.deQueue());
        System.out.println(genericQueue.deQueue());


        System.out.println("---------------GENERIC STACK -----------------------");

        GenericStack<Integer> genericStack = new GenericStack<Integer>();
        genericStack.push(1);
        genericStack.push(2);
        genericStack.push(3);
        System.out.println(genericStack.pop());
        System.out.println(genericStack.pop());
        System.out.println(genericStack.pop());

        System.out.println("---------GENERIC STACK IMPLEMENT ITERATOR ---------");

        IteratingStack<Integer> iteratorStack = new IteratingStack<Integer>();
        iteratorStack.push(1);
        iteratorStack.push(2);
        iteratorStack.push(3);
        Iterator<Integer> i = iteratorStack.iterator();
        System.out.println("===> Using While loop to iterate elements from the linked List");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("===> Using For each loop to iterate elements from the linked List");
        for (Integer e: iteratorStack) {
            System.out.println(e);
        }

        IteratingQueue<Integer> iteratingQueue = new IteratingQueue();
        // If you don't mention type ( Integer inside <> to specify type you will find
        // error(you will be obliged to use Object to iterate items)

        iteratingQueue.enqueue(1);
        iteratingQueue.enqueue(2);
        iteratingQueue.enqueue(3);
        Iterator j = iteratingQueue.iterator();
        System.out.println("===> Using While loop to iterate elements from the Queue List");
        while (j.hasNext()) {
            System.out.println(j.next());
        }
        System.out.println("===> Using For each loop to iterate elements from the Queue List");
        for (Integer e: iteratingQueue) {
            System.out.println(e);
        }
    }
}