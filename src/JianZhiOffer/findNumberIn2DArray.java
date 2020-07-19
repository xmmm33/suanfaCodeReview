package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 10:42
 **/
public class findNumberIn2DArray {

    /**
     * 二维数组的查找
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            }else {
                return true;
            }
        }
        return false;
    }
}