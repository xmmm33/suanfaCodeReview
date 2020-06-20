package quickSort;

public class quickSort {

    // 快速排序,先排序再划分
    public static void quickSort(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        quickSortMergeThenPart(arrays, 0, arrays.length - 1);
        System.out.println("快速排序完成");
        for (Integer i : arrays) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    private static void quickSortMergeThenPart(int[] arrays, int left, int right) {
        if (left >= right) {
            return;
        }
        int l = left;
        int r = right;
        int base = arrays[left];
        while (l < r) {
            while (l < r && arrays[r] >= base) {
                r--;
            }
            arrays[l] = arrays[r];
            while (l < r && arrays[l] <= base) {
                l++;
            }
            arrays[r] = arrays[l];
        }
        arrays[l] = base;
        quickSortMergeThenPart(arrays, left, l-1);
        quickSortMergeThenPart(arrays, r + 1, right);
    }

    public static void main(String[] args) {
        quickSort(new int[]{4, 52, 5, 2, 4, 23, 523, 523, 4, 5});
    }
}
