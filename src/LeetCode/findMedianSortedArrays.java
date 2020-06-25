package LeetCode;

public class findMedianSortedArrays {

    /**
     * 寻找两个正序数组的中位数
     * 思路：首先是确定中位数的位置，就是两个数组的总长度 len/2
     *      两个数组一起走，走到len/2的位置就是中位数的位置
     *      如果是偶数，那么这个中位数就要加上中位数的前一个位置的数字除以2
     *      如果是奇数，那么这个中位数就是这个位置上的数字
     *      所以我就采用left总是来保存上一个遍历的数字
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        int left = -1, right = -1;
        int astart = 0, bstart = 0;
        for (int i = 0; i <= len / 2; i++) {
            left = right;
            // 这个if的意思是nums2如果走到最后一个元素了 或者 nums2的元素大于nums1的元素 那么nums1的指针就要往前走
            if (astart < len1 && (bstart >= len2 || nums1[astart] < nums2[bstart])) {
                right = nums1[astart++];
            }else {
                right = nums2[bstart++];
            }
        }
        // 偶数
        if ((len & 1) == 0) {
            return (left+right)/2.0;
        }else {
            return right;
        }
    }

    public static void main(String[] args) {
//        findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
    }
}
