package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge {

    public static void main(String[] args) {
        merge(new int[][]{{1, 4}, {0, 1}});
    }
    /**
     * 合并区间
     *
     * 输入: [[1,3],[2,6],[8,10],[15,18]]
     * 输出: [[1,6],[8,10],[15,18]]
     * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
     * @param intervals
     * @return
     */
    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length < 1 || intervals[0].length < 1) {
            return new int[0][0];
        }
        // 先对二维数组按照第0个元素进行排序
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        List<int[]> temp = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            // 找到满足条件的区间，例如（a，b）和（c，d）&& a <= c,那么此时这两个区间是否能合并，就看b 是否大于等于 c，如果成立则说明可以合并
            while (i < intervals.length - 1 && intervals[i + 1][0] <= right) {
                // 更新右区间的大小 继续判断下一个区间是否能合并
                right = Math.max(right, intervals[i+1][1]);
                i++;
            }
            temp.add(new int[]{left, right});
        }
        return temp.toArray(new int[0][]);
    }
}
