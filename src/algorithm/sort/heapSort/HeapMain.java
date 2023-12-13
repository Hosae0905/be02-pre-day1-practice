package algorithm.sort.heapSort;

import java.util.Arrays;

public class HeapMain {
    public static void main(String[] args) {
        Heap hs = new Heap();


        int[] arr = {13,49,5,87,12,39,8,43,7,28,58};
        int[] newArr;


        System.out.println("입력된 배열 : " + Arrays.toString(arr));
        newArr = hs.heapSort(arr);
        System.out.println("정렬된 배열 : " + Arrays.toString(newArr));
    }
}

