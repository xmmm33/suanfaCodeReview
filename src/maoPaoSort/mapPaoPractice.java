package maoPaoSort;

public class mapPaoPractice {

    public static void main(String[] args) {
        maoPaoPractice(new int[]{5, 34, 56, 6, 5, 6, 1, 24, 4});
    }

    // 冒泡排序练习
    public static void maoPaoPractice(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - 1; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }
        for (Integer i : arrays) {
            System.out.println(i);
        }
    }
}
