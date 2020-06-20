package insertSort;

public class insertSortPratice {

    public static void main(String[] args) {
        inserSortPractice(new int[]{5, 34, 56, 6, 5, 6, 1, 24, 4});
    }

    public static void inserSortPractice(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        for (int i = 1; i < arrays.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrays[j] < arrays[j - 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j - 1];
                    arrays[j - 1] = temp;
                }
            }
        }
        for (Integer i : arrays) {
            System.out.println(i);
        }
    }
}
