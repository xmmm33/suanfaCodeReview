package LeetCode.Arrays.removeDuplicates;

public class removeDuplicates {

    /**
     * 删除排序数组中的重复元素，数组中每个元素只允许出现一次
     * 双指针法
     * @param nums
     * @return
     */
    public static int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        // 这个指针总是指向当前最大的元素的下标
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[maxIndex]) {
                maxIndex++;
                nums[maxIndex] = nums[i];
            }
        }
        return maxIndex+1;
    }

    public static void main(String[] args) {
        removeDuplicates2(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
//        removeDuplicates(new int[]{1, 1, 2});
    }
}
