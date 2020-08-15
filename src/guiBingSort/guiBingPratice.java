package guiBingSort;

public class guiBingPratice {

    public static void main(String[] args) {
        gb(new int[]{5, 34, 56, 6, 5, 6, 1, 24, 4});
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

    public static void gb(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        partly(arrays, 0, arrays.length - 1);
        for (Integer i : arrays) {
            System.out.println(i);
        }
    }

    private static void partly(int[] arrays, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        partly(arrays, left, mid);
        partly(arrays, mid + 1, right);
        mergrmy(arrays, left, mid, right);
    }

    private static void mergrmy(int[] arrays, int left, int mid, int right) {
        int low = left;
        int k = left;
        int high = mid + 1;
        int[] fz = new int[arrays.length];
        while (low <= mid && high <= right) {
            if (arrays[low] < arrays[high]) {
                fz[k++] = arrays[low++];
            }else {
                fz[k++] = arrays[high++];
            }
        }
        while (low <= mid) {
            fz[k++] = arrays[low++];
        }
        while (high <= right) {
            fz[k++] = arrays[high++];
        }
        if (right + 1 - left >= 0) System.arraycopy(fz, left, arrays, left, right + 1 - left);
    }
}
