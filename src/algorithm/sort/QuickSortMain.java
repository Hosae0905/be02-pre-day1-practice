package algorithm.sort;

public class QuickSortMain {
    public static void main(String[] args) {

        LeftQuickSort quickSort = new LeftQuickSort();
        MiddleQuickSort middleQuickSort = new MiddleQuickSort();

        int[] arr = { 10, 7, 12, 52, 30, 25, 9, 85, 66, 5, 15 };
        int[] arr1 = { 10, 7, 12, 52, 30, 25, 9, 85, 66, 5, 15 };
        int[] arr2 = { 90, 80, 70, 60, 50, 40, 30, 20, 10, 5, 4 };
        int[] arr3 = { 90, 80, 70, 60, 50, 40, 30, 20, 10, 5, 4 };
        int[] arr4 = { 10, 7, 12, 52, 30, 25, 9, 85, 66, 5, 15 };

        quickSort.sort(arr);
        quickSort.basicSort(arr1);
        quickSort.quickSortPrint(arr);
        quickSort.basicSortPrint(arr1);

        quickSort.basicSort(arr2);
        quickSort.basicSortPrint(arr2);

        middleQuickSort.sort(arr3);
        middleQuickSort.sortPrint(arr3);

        middleQuickSort.sort(arr4);
        middleQuickSort.sortPrint(arr4);

    }
}
