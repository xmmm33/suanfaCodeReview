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
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] > arrays[j]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
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
