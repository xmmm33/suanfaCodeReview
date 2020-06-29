package LeetCode.Arrays;

import java.util.Arrays;

public class merge {

    /**
     * 合并两个有序的数组
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] fuzhi = new int[m + n];
        int a = 0;
        int b = 0;
        int k = 0;
        while (a < m && b < n) {
            if (nums1[a] < nums2[b]) {
                fuzhi[k++] = nums1[a++];
            }else {
                fuzhi[k++] = nums2[b++];
            }
        }
        while (a < m) {
            fuzhi[k++] = nums1[a++];
        }
        while (b < n) {
            fuzhi[k++] = nums2[b++];
        }
        for (int i = 0; i < fuzhi.length; i++) {
            nums1[i] = fuzhi[i];
        }
    }
}
