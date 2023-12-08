package dataStructure.stack;

import java.util.Arrays;

public class MyStack<E> {
    private Object[] stack;
    private int top = -1;
    private final int DEFAULT_SIZE = 5;

    public MyStack() {
        this.stack = new Object[DEFAULT_SIZE];
    }

    public MyStack(int stackSize) {
        this.stack = new Object[stackSize];
    }

    public boolean isEmpty() {
//        if (top == -1) {
//            return true;
//        } else {
//            return false;
//        }

        return top == -1;
    }

    public boolean isFull() {
//        if (top == algorithmTest.stack.length - 1) {
//            return true;
//        } else {
//            return false;
//        }

        return top == stack.length - 1;
    }

    public E peek() {
        if (top == -1) {
            return null;
        } else {
            return (E)stack[top];
        }
    }

    public void push(E value) {
        if (!isFull()) {
            top++;
            stack[top] = value;
        } else {
            stack = Arrays.copyOf(stack, stack.length + DEFAULT_SIZE);
            top++;
            stack[top] = value;
        }
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        } else {
            E topValue = (E)stack[top];
            top--;
            stack = Arrays.copyOf(stack, stack.length - 1);
            return topValue;
        }
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print("[" + stack[i] + "]");
        }
        System.out.println();
    }

    public int size() {
        return stack.length;
    }
}
