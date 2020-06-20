package maoPaoSort;

public class mapPaoSort {

    /**
     * 冒泡排序
     */
    public static void maoPao(int[] arrays) {
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
        System.out.println("冒泡排序完成：");
        for (Integer i : arrays) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        maoPao(new int[]{4,52,5,2,4,23,523,523,4,5});
    }
}
