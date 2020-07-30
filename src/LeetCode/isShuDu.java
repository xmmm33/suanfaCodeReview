package LeetCode;

/**
 * @author humingjiang 2020-07-30 17:10
 **/
public class isShuDu {

    /**
     * 判断一个矩阵是否是数独矩阵
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        // 表示第i行num数字是否出现过
        boolean[][] rowexist = new boolean[9][9];
        // 表示第j列num数字是否出现过
        boolean[][] colexist = new boolean[9][9];
        // 在3X3的小方格里面是否出现过num数字
        boolean[][] boxexist = new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '1';
                    int boxindex = i /3 * 3 + j/3;
                    if(rowexist[i][num] || colexist[j][num] || boxexist[boxindex][num]){
                        return false;
                    }else{
                        rowexist[i][num] = true;
                        colexist[j][num] = true;
                        boxexist[boxindex][num] = true;
                    }
                }
            }
        }
        return true;
    }
}