package org.example;

import org.example.generics.GenericQueue;
import org.example.generics.GenericStack;

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

        ///
    }

}