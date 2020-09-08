package JianZhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author humingjiang 2020-07-25 14:36
 **/
public class minNumber {
    public String minNumber(int[] nums) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            temp.add(String.valueOf(nums[i]));
        }
        temp.sort((a1, a2) -> (a1 + a2).compareTo(a2 + a1));
        StringBuilder ret = new StringBuilder();
        for (String t : temp) {
            ret.append(t);
        }
        return ret.toString();
    }

    public String minNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        List<String> tmp = new ArrayList<String>();
        for (int i = 0; i < nums.length; i++) {
            tmp.add(String.valueOf(nums[i]));
        }
        tmp.sort((a1, a2) -> (a1 + a2).compareTo(a2 + a1));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tmp.size(); i++) {
            sb.append(tmp.get(i));
        }
        return sb.toString();
    }
}