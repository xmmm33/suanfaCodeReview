package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 11:30
 **/
public class getLeastNumbers {

    public static void main(String[] args) {
        getLeastNumbers(new int[]{0, 1, 1, 2, 4, 4, 1, 3, 3, 2}, 6);
    }

    /**
     * topk
     * 最大堆找最小的几个数
     * @param arr
     * @param k
     * @return
     */
    public static int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length < 1) {
            return new int[0];
        }
        int[] ret = new int[k];
        buildheap(arr, k);
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                arr[0] = arr[i];
                buildheap(arr, k - 1);
            }
        }
        for (int i = 0; i < k; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }

    private static void buildheap(int[] arr, int len) {
        for (int j = (len - 2) / 2; j >= 0; j--) {
            adjust(arr, j, len);
        }
    }

    private static void adjust(int[] arr, int parent, int len) {
        for (int j = 2 * parent + 1; j < len; j = 2 * j  + 1) {
            if (j + 1 < len && arr[j] < arr[j + 1]) {
                j++;
            }
            if (arr[j] > arr[parent]) {
                int temp = arr[j];
                arr[j] = arr[parent];
                arr[parent] = temp;
                parent = j;
            }
        }
    }
}