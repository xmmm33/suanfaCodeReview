package heapSort;

public class heapSort {

    public static void main(String[] args) {
        heapSort(new int[]{4, 52, 5, 2, 4, 23, 523, 523, 4, 5});
    }
    // 堆排序
    public static void heapSort(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        constructHeap(arrays);
        heapToSort(arrays);
        System.out.println("堆排序完成");
        for (Integer i : arrays) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    private static void heapToSort(int[] arrays) {
        for (int i = arrays.length - 1; i > 0; i--) {
            int temp = arrays[i];
            arrays[i] = arrays[0];
            arrays[0] = temp;
            buildHeap(arrays, 0, i);
        }
    }

    private static void constructHeap(int[] arrays) {
        for (int i = (arrays.length - 2) / 2; i >= 0; i--) {
            buildHeap(arrays, i, arrays.length);
        }
    }

    private static void buildHeap(int[] arrays, int parent, int length) {
        int temp = arrays[parent];
        for (int i = 2 * parent + 1; i < length; i = 2 * i + 1) {
            if (i + 1 < length && arrays[i] < arrays[i + 1]) {
                i = i + 1;
            }
            if (temp > arrays[i]) {

            }else {
                int a = arrays[i];
                arrays[i] = arrays[parent];
                arrays[parent] = a;
                parent = i;
            }
        }
    }

}
