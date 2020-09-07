import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String target = sc.nextLine();
        target = sc.nextLine();
        int max = 1;
        for (int i = len / 2; i >= 0; i--) {
            if (target.lastIndexOf(target.substring(0,i)) > 0) {
                max = Math.max(max, i);
                break;
            }
        }
        System.out.println(len - max + 1);
    }
}