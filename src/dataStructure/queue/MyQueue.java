package dataStructure.queue;

public class MyQueue<E> {
    private Object[] queue;
    private int front = 0;
    private int rear = 0;
    private final int DEFAULT_SIZE = 5;

    public MyQueue() {
        this.queue = new Object[DEFAULT_SIZE];
    }

    public MyQueue(int stackSize) {
        this.queue = new Object[stackSize];
    }

    public boolean isEmpty() {
        System.out.println("비어 있음");
        return front == rear;
    }

    public boolean isFull() {
        System.out.println("가득 차 있음");
        return rear == queue.length;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        } else {
            return (E)queue[front];
        }
    }

    public void add(E value) {
        if (!isFull()) {
            queue[rear] = value;
            rear++;
        } else {
            resize(value);
        }
    }

    public E pool() {
        if (isEmpty()) {
            return null;
        } else {
            E frontValue = (E) queue[front];
            queue[front] = null;
            front++;
            return frontValue;
        }
    }

    public void display() {
        for (int i = front; i < rear; i++) {
            System.out.print("[" + queue[i] + "]");
        }
        System.out.println();
    }

    public int size() {
        return queue.length;
    }

    private void resize(E value) {
        rear /= front;

        queue[rear] = value;
    }
}
