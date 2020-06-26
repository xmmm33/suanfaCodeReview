package LeetCode.Arrays;

import java.util.Arrays;

public class numOfSubarrays {

    /**
     * 大小为 K 且平均值大于等于阈值的子数组数目
     * 思路：滑动窗口，先求出第一个子数组的和，和目标和进行比较；然后就减去窗口的第一个值，加上窗口的后面一个值，再进行比较，循环操作
     * @param arr
     * @param k
     * @param threshold
     * @return
     */
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int avgSum = k * threshold;
        int tempsum = 0;
        for (int i = 0; i < k; i++) {
            tempsum += arr[i];
        }
        int res = 0;
        res = tempsum >= avgSum ? res+1 : res;
        int r = k;
        while (r < arr.length) {
            tempsum = tempsum - arr[r - k];
            tempsum = tempsum + arr[r];
            res = tempsum >= avgSum ? res + 1 : res;
            r++;
        }
        return res;
    }

    public static void main(String[] args) {
//        numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4);
//        numOfSubarrays(new int[]{1, 1, 1, 1, 1}, 1, 0);
        numOfSubarrays(new int[]{11, 13, 17, 23, 29, 31, 7, 5, 2, 3}, 3, 5);
    }
}
