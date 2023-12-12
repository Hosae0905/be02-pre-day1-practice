package algorithm.sort.insertionSort;

public class InsertSort {
    public void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int targetValue = arr[i];
            int previousIndex = i - 1;

            while (previousIndex >= 0 && targetValue < arr[previousIndex]) {
                arr[previousIndex+1] = arr[previousIndex];
                previousIndex -= 1;
            }
            arr[previousIndex + 1] = targetValue;

            System.out.print(targetValue + " 삽입 -> ");
            printArray(arr);
        }
    }

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
