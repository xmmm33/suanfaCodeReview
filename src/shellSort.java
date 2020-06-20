public class shellSort {

    // 希尔排序-就是升级版的插入排序
    public static void shellSort(int[] arrays) {
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
        System.out.println("希尔排序完成");
        for (Integer i : arrays) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        shellSort(new int[]{4, 52, 5, 2, 4, 23, 523, 523, 4, 5});
    }
}
