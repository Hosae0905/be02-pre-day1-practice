package dataStructure.list;

public class LinkedListMain {
    public static void main(String[] args) throws NullPointerException{
        LinkedListTest<Integer> list = new LinkedListTest<>();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.display();

        list.insertLast(40);
        list.insertLast(50);
        list.display();

        list.insertIndex(60, 2);
        list.display();

        try {
            list.removeFirst();
            list.display();

            list.removeLast();
            list.display();

            list.removeIndex(2);
            list.display();
        } catch (NullPointerException e) {
            System.out.printf("%s 에러가 발생하였습니다.\n", e.getMessage());
            System.out.println("잘못된 값이 삽입되었습니다.");
        }
    }
}
