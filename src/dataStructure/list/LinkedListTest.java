package dataStructure.list;

public class LinkedListTest<E> {
    
    Node<E> head;       // 맨 처음 노드

    public LinkedListTest() {
        this.head = null;
    }

    public void display() {
        Node<E> node = head;
        while (node != null) {
            System.out.printf("[%d]", node.data);
            node = node.next;
        }
        System.out.println();
    }

    public void insertFirst(E data) {
        Node<E> node = new Node<>(data, null);

        if (head == null) {
            this.head = node;
        } else {
            node.next = head;
            this.head = node;
        }
    }

    public void insertLast(E data) {
        if (head == null) {
            insertFirst(data);
        } else {
            Node<E> node = head;
            Node<E> newNode = new Node<>(data, null);

            while (node.next != null) {
                node = node.next;
            }

            node.next = newNode;
        }
    }

    public void insertIndex(E data, int index) {

        if (head == null || index == 0) {
            insertFirst(data);
        } else {
            Node<E> node = head;
            Node<E> newNode = new Node<>(data, null);

            for (int i = 0; i < index; i++) {
                node = node.next;
            }

            Node<E> temp = node.next;

            node.next = newNode;
            newNode.next = temp;

        }
    }
    
    // TODO: 맨 처음 노드를 삭제하는 기능
    public void removeFirst() {
        if (head == null) {
            throw new NullPointerException();
        } else {
            Node<E> node = head.next;
            head.next = null;
            head = node;
        }
    }
    
    // TODO: 맨 마지막 노드를 삭제하는 기능
    public void removeLast() {
        if (head == null) {
            throw new NullPointerException();
        } else {
            Node<E> currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            Node<E> beforeNode = head;

            while (beforeNode.next != currentNode) {
                beforeNode = beforeNode.next;
            }

            beforeNode.next = null;
            currentNode.data = null;
        }
    }
    
    // TODO: 원하는 순서의 노드를 삭제하는 기능
    public void removeIndex(int index) {
        if (head == null || index < 0) {
            throw new NullPointerException();
        } else if (index == 0) {
            removeFirst();
        } else {
            Node<E> node = head;

            for (int i = 0; i < index; i++) {
                node = node.next;
            }

            Node<E> nextNode = node.next;       // 삭제하고 싶은 노드의 다음 노드
            Node<E> beforeNode = head;          // 삭제하고 싶은 노드의 이전 노드

            while (beforeNode.next != node) {
                beforeNode = beforeNode.next;
            }

            beforeNode.next = nextNode;

            node.next = null;
            node.data = null;
        }
    }
}
