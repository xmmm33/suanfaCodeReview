package guiBingSort;

public class guiBingSort {

    public static void main(String[] args) {
        guiBingSort(new int[]{4, 52, 5, 2, 4, 23, 523, 523, 4, 5});
    }
    // 归并排序, 先划分再合并
    public static void guiBingSort(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        guiBingSortPart(arrays, 0, arrays.length-1);
        System.out.println("完成了归并排序");
        for (Integer i : arrays) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    private static void guiBingSortPart(int[] arrays, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        guiBingSortPart(arrays,left, mid);
        guiBingSortPart(arrays, mid + 1, right);
        merge(arrays, left, mid, right);
    }

    private static void merge(int[] arrays, int left, int mid, int right) {
        int low = left, k = left;
        int high = mid + 1;
        int[] fuzhi = new int[arrays.length];
        while (low <= mid && high <= right) {
            if (arrays[low] < arrays[high]) {
                fuzhi[k++] = arrays[low++];
            }else {
                fuzhi[k++] = arrays[high++];
            }
        }
        while (low <= mid) {
            fuzhi[k++] = arrays[low++];
        }
        while (high <= right) {
            fuzhi[k++] = arrays[high++];
        }
        for (int i = left; i <= right; i++) {
            arrays[i] = fuzhi[i];
        }
    }
}
