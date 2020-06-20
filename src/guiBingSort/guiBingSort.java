package guiBingSort;

public class guiBingSort {

    // 归并排序
    public static void guiBingSort(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        for (int gap = arrays.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < arrays.length; i = i + gap) {
                for (int j = gap; j >= 0; j = j - gap) {
                    if (arrays[j] < arrays[j - gap]) {
                        int temp = arrays[j];
                        arrays[j] = arrays[j - gap];
                        arrays[j - gap] = temp;
                    }
                }
            }
        }
        System.out.println("");
    }
}
