import java.util.*;

public class Main{
    public static final String num = ".*\\d+.*";

    public static final String daxie = ".*[A-Z]+.*";

    public static final String xiaoxie = ".*[a-z]+.*";

    public static final String dot = ".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*";
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputstring = sc.nextLine();
        String[] passwords = inputstring.split(" ");
        for (int i = 0; i < passwords.length; i++) {
            System.out.println(checkIsCorrect(passwords[i]));;
        }
    }

    private static int checkIsCorrect(String password) {
        if (password.length() < 8 || password.length() > 120) {
            return 1;
        }
        int i = 0;
        if (password.matches(num)) {
            i++;
        }
        if (password.matches(daxie)) i++;
        if (password.matches(xiaoxie)) i++;
        if (password.matches(dot)) i++;
        if (i < 4) {
            return 2;
        }
        return 0;
    }
}