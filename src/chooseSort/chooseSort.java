package chooseSort;

public class chooseSort {

    // 选择排序
    public static void chooseSort(int[] arrays) {
        if (arrays == null || arrays.length < 1) {
            return;
        }
        for (int i = 0; i < arrays.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[minindex] > arrays[j]) {
                    minindex = j;
                }
            }
            int temp = arrays[minindex];
            arrays[minindex] = arrays[i];
            arrays[i] = temp;
        }
        System.out.println("选择排序完成");
        for (Integer i : arrays) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        chooseSort(new int[]{4,52,5,2,4,23,523,523,4,5});
    }


}
