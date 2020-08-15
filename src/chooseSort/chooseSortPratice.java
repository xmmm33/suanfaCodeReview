package chooseSort;

public class chooseSortPratice {

    public static void main(String[] args) {
        choose(new int[]{5, 34, 56, 6, 5, 6, 1, 24, 4});
    }

    public static void chooseSortPractice(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        for (int i = 0; i < arrays.length; i++) {
            int minindex = i;
            for (int j = i; j < arrays.length; j++) {
                if (arrays[minindex] > arrays[j]) {
                    minindex = j;
                }
            }
            int temp = arrays[minindex];
            arrays[minindex] = arrays[i];
            arrays[i] = temp;
        }
        for (Integer i : arrays) {
            System.out.println(i);
        }
    }

    public static void choose(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            int minPos = i;
            for (int j = i; j < arrays.length; j++) {
                if (arrays[j] < arrays[minPos]) {
                    minPos = j;
                }
            }
            int temp = arrays[minPos];
            arrays[minPos] = arrays[i];
            arrays[i] = temp;
        }
        for (Integer i : arrays) {
            System.out.println(i);
        }
    }
}
