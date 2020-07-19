package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 11:32
 **/
public class minArray {

    /**
     * 旋转数组中最小的值
     * @param numbers
     * @return
     */
    public int minArray(int[] numbers) {
        if (numbers == null || numbers.length < 1) {
            return -1;
        }
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] < numbers[high]) {
                high = mid;
            } else if (numbers[mid] > numbers[high]) {
                low = mid + 1;
            }else {
                high--;
            }
        }
        return numbers[low];
    }
}