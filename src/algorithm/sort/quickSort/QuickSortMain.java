package algorithm.sort.quickSort;

public class QuickSortMain {
    public static void main(String[] args) {

        LeftQuickSort quickSort = new LeftQuickSort();
        MiddleQuickSort middleQuickSort = new MiddleQuickSort();

        int[] arr = { 90, 80, 70, 60, 50, 40, 30, 20, 10, 5 };
        int[] arr1 = { 90, 80, 70, 60, 50, 40, 30, 20, 10, 5 };
        int[] arr2 = { 90, 80, 70, 60, 50, 40, 30, 20, 10, 5 };

        System.out.println("=======================퀵 정렬(가운데 피벗 설정)=================");
        middleQuickSort.sort(arr);
        middleQuickSort.sortPrint(arr);

        System.out.println();

        System.out.println("=======================퀵 정렬(왼쪽 피벗 설정)===================");
        quickSort.sort(arr1);
        quickSort.quickSortPrint(arr1);

        System.out.println();

        System.out.println("=======================버블 정렬===============================");
        middleQuickSort.basicSort(arr2);
        middleQuickSort.basicSortPrint(arr2);

    }
}
