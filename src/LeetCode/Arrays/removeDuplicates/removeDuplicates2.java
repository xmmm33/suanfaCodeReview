package LeetCode.Arrays.removeDuplicates;

public class removeDuplicates2 {


    public static void main(String[] args) {
        removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});
    }

    /**
     * 删除排序数组中重复的元素，但是允许一个元素最多出现两次
     * 还是双指针的思想
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // 总是新数组里面的元素 与 老数组里面的元素进行对比
            if (i < 2 || nums[j] > nums[i - 2]) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
