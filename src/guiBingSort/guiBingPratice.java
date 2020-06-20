package guiBingSort;

public class guiBingPratice {

    public static void main(String[] args) {
        guiBingPratice(new int[]{5, 34, 56, 6, 5, 6, 1, 24, 4});
    }

    public static void guiBingPratice(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        guibing(arrays, 0, arrays.length - 1);
        for (Integer i : arrays) {
            System.out.println(i);
        }
    }

    private static void guibing(int[] arrays, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        guibing(arrays, left, mid);
        guibing(arrays, mid + 1, right);
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
