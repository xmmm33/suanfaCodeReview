package quickSort;

public class quickSortPractice {

    public static void main(String[] args) {
        quickSortPractice(new int[]{5, 34, 56, 6, 5, 6, 1, 24, 4});
    }

    public static void quickSortPractice(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        sortAndPart(arrays, 0, arrays.length - 1);
        for (Integer i : arrays) {
            System.out.println(i);
        }
    }

    private static void sortAndPart(int[] arrays, int left, int right) {
        if (left >= right) {
            return;
        }
        int base = arrays[left];
        int l = left;
        int r = right;
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
        sortAndPart(arrays, left, l - 1);
        sortAndPart(arrays, l + 1, right);
    }
}
