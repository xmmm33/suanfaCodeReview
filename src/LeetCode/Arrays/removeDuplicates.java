package LeetCode.Arrays;

public class removeDuplicates {


    /**
     * 删除排序数组中重复的数字
     * 暴力
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int left = 0;
        while (left < nums.length) {
            int right = left+1;
            while (right < nums.length) {
                 if (nums[left] != nums[right] && nums[left] < nums[right]){
                    left++;
                    nums[left] = nums[right];
                    break;
                }
                 right++;
            }
            if (right == nums.length) {
                left++;
            }
        }
        int ret = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                ret++;
            }else {
                break;
            }
        }
        return ret;
    }

    /**
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
