package insertSort;

public class insertSort {

    // 插入排序
    public static void insertSort(int[] arrays) {
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
        System.out.println("插入排序完成");
        for (Integer i : arrays) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        insertSort(new int[]{4, 52, 5, 2, 4, 23, 523, 523, 4, 5});
    }
}
