package LeetCode.Arrays.mergeQuJian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insert {

    /**
     * 插入区间
     * @param intervals
     * @param newInterval
     * @return
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] temp = new int[intervals.length + 1][2];
        int i = 0;
        for (int[] a : intervals) {
            temp[i++] = a;
        }
        temp[i] = newInterval;
        Arrays.sort(temp, (v1, v2) -> v1[0] - v2[0]);
        List<int[]> ret = new ArrayList<>();
        for (int j = 0; j < temp.length; j++) {
            int left = temp[j][0];
            int right = temp[j][1];
            while (j < temp.length - 1 && right >= temp[j + 1][0]) {
                right = Math.max(right, temp[j + 1][1]);
                j++;
            }
            ret.add(new int[]{left, right});
        }
        return ret.toArray(new int[0][]);
    }
}
