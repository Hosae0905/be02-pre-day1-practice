package dataStructure.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class stackMain {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);


        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.display();

        System.out.println(stack.peek());

        System.out.println(stack.isFull());

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());

        System.out.println("================================================================");

        MyStack<String> stack1 = new MyStack<>();
        stack1.push("a");
        stack1.push("b");
        stack1.push("c");
        stack1.push("d");
        stack1.push("e");

        stack1.display();

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

        stack1.display();

        System.out.println(stack1.peek());
        System.out.println(stack1.isFull());
        System.out.println(stack1.isEmpty());

    }
}
