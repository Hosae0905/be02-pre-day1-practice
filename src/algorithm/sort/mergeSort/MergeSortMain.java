package algorithm.sort.mergeSort;

public class MergeSortMain {
    // Driver code
    public static void main(String args[])    {
        TopDownMerge topDown = new TopDownMerge();
        int arr[] = { 11, 12, 5, 13, 7, 6, 24, 19, 2, 29};

        System.out.print("정렬할 배열 : ");
        topDown.printArray(arr);

        topDown.mergeSort(arr);

//        int arr2[] = { 11, 12, 5, 13, 7, 6, 24, 19};
//
//        topDown.mergeSort(arr2);
//        int arr3[] = { 11, 12, 5, 13, 7, 6, 24, 19, 2, 29, 44, 78};
//        topDown.mergeSort(arr3);

//        BottomUpMerge bottomUp = new BottomUpMerge();
//        bottomUp.printArray(arr);
//        bottomUp.merge_sort(arr);
    }
}
