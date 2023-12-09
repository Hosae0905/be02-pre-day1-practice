package algorithm.sort;

public class MiddleQuickSort {

    int quickCount = 0;

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = partition(arr, low, high);

        quickSort(arr, low, pivot);
        quickSort(arr, pivot + 1, high);

    }

    private int partition(int[] arr, int left, int right) {
        int low = left - 1;
        int high = right + 1;
        int pivot = arr[(left + right) / 2];

        while (true) {
            while (arr[++low] < pivot) {
                continue;
            }
            while (arr[--high] > pivot && low <= high) {
                continue;
            }

            if (low >= high) {
                return high;
            }

            swap(arr, low, high);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        quickCount++;
    }

    public void sortPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(quickCount);
    }
}
