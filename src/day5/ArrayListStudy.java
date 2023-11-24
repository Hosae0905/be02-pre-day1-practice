package day5;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(333);
        arrayList.add(2, 444);

        arrayList.remove(2);


        System.out.println(arrayList);

        Integer result = arrayList.get(2);
        int size = arrayList.size();

        System.out.println(result);
        System.out.println(size);

        boolean contains = arrayList.contains(222);
        int indexof = arrayList.indexOf(333);

        System.out.println("contains = " + contains);
        System.out.println("indexof = " + indexof);
    }
}
