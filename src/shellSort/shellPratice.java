package shellSort;

public class shellPratice {

    public static void main(String[] args) {
        shell(new int[]{5, 34, 56, 6, 5, 6, 1, 24, 4});
    }

    public static void shellPractice(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        for (int gap = arrays.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < arrays.length; i = i + gap) {
                for (int j = i; j > 0; j = j - gap) {
                    if (arrays[j] < arrays[j - gap]) {
                        int temp = arrays[j];
                        arrays[j] = arrays[j - gap];
                        arrays[j - gap] = temp;
                    }
                }
            }
        }
        for (Integer i : arrays) {
            System.out.println(i);
        }
    }

    public static void shell(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        for (int gap = arrays.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arrays.length; i += gap) {
                for (int j = i; j > 0; j -= gap) {
                    if (arrays[j] < arrays[j - gap]) {
                        int temp = arrays[j];
                        arrays[j] = arrays[j - gap];
                        arrays[j - gap] = temp;
                    }
                }
            }
        }
        for (Integer i : arrays) {
            System.out.println(i);
        }
    }
}
