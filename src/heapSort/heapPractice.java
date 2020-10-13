package heapSort;

public class heapPractice {

    public static void main(String[] args) {
        heap(new int[]{5,13,9,2,3,19});
    }



    public static void heap(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        buildheap(arrays);
        heapSortMy(arrays);
        for (Integer i : arrays) {
            System.out.println(i);
        }
    }

    private static void heapSortMy(int[] arrays) {
        for (int i = arrays.length - 1; i >= 0; i--) {
            int max = arrays[0];
            arrays[0] = arrays[i];
            arrays[i] = max;
            adjustHeap(arrays, 0, i);
        }
    }

    private static void buildheap(int[] arrays) {
        for (int i = (arrays.length - 2) / 2; i >=0 ; i--) {
            adjustHeap(arrays, i, arrays.length);
        }
    }

    private static void adjustHeap(int[] arrays, int parentIndex, int length) {
        int parent = arrays[parentIndex];
        for (int i = 2 * parentIndex + 1; i < length; i = 2 * i + 1) {
            if (i + 1 < length && arrays[i] < arrays[i + 1]) {
                i++;
            }
            if (arrays[i] < parent) {

            } else {
                int temp = arrays[i];
                arrays[i] = arrays[parentIndex];
                arrays[parentIndex] = temp;
                parentIndex = i;
            }
        }
    }
}
