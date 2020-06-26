package LeetCode.Arrays;

public class removeElement {

    /**
     * 移除所有等于val的元素，要求就地修改
     * 双指针
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
//        removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        removeElement(new int[]{4,5}, 5);
//        removeElement(new int[]{3}, 2);
    }
}
