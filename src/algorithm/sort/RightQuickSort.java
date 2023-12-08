package algorithm.sort;

public class RightQuickSort {
    // 정렬하는 코드
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];      // 마지막 인덱스 위치에 있는 값을 피벗으로 설정

        int i = low - 1;       // ??

        for (int j = low; j <= high - 1; j++) {     // 맨앞의 위치부터 피벗 전까지의 위치까지 비교
            if (arr[j] < pivot) {       // 피벗과 맨 앞에서부터 데이터를 비교
                i++;                    // 피벗보다 작으면 i값 증가
                swap(arr, i, j);        // j위치와 스왑
            }
        }
        swap(arr, i + 1, high);       // 앞의 위치와 설정한 피벗값을 스왑
        return i + 1;       // 파티션 인덱스 반환
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {       // low값과 high값을 비교
            int partitionIndex = partition(arr, low, high);     // 파티션을 돌려서 반환값 받기
            quickSort(arr, low, partitionIndex - 1);       // 퀵 정렬 실행(재귀)
            quickSort(arr, partitionIndex + 1, high);       // 퀵 정렬 실행(재귀)
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        RightQuickSort sort = new RightQuickSort();
        sort.quickSort(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
