package algorithm.sort.shellSort;

public class SortMain {
    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();

        int[] array = {8, 3, 1, 7, 2};

        int[] sortedArray = shellSort.shellSort(array.clone());

        for (int i : sortedArray) {
            System.out.print(i + ", ");
        }
    }
}
