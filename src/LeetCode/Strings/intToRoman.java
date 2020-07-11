package LeetCode.Strings;

/**
 * @author humingjiang 2020-07-11 11:25
 **/
public class intToRoman {

    public static void main(String[] args) {
        intToRoman(4);
    }
    /**
     * 把数字转换为罗马字符串
     * @param num
     * @return
     */
    public static String intToRoman(int num) {
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] reps={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder res = new StringBuilder();
        for(int i=0; i<13; i++){
            while(num>=values[i]){
                num -= values[i];
                res.append(reps[i]);
            }
        }
        return res.toString();
    }
}