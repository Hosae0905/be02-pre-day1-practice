package algorithm.sort.shellSort;

public class ShellSort {
    public void incInsertionSort(int[] list, int first, int gap) {
        int i, j, key;
        for (i = first + gap; i < list.length; i = i + gap) {
            key = list[i];
            for (j = i - gap; j >= first && key < list[j]; j = j - gap) {
                list[j + gap] = list[j];
            }
            list[j + gap] = key;
        }
    }

    public int[] shellSort(int[] list) {
        int i, gap;
        for (gap = list.length / 2; gap > 0; gap = gap / 2) {
            if (gap % 2 == 0)
                gap = gap + 1;
            for (i = 0; i < gap; i++) {
                incInsertionSort(list, i, gap);
            }
        }
        return list;
    }
}
        
