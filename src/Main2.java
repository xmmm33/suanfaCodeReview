import java.util.*;

public class Main2 {

    static Set<Character> dot = new HashSet<>();

    public static void main(String[] args) {
        dot.add('.');
        dot.add(',');
        dot.add('!');
        dot.add('?');
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        String[] arrays = source.split(";");
        String origin = arrays[0];
        String diff = arrays[1];
        int pianCha = getPianCha(origin, diff);
        int cnt = getLength(diff);
        StringBuilder res = new StringBuilder();
        res.append("(").append(pianCha).append(",").append(cnt).append(")");
        System.out.println(res.toString());
    }

    private static int getPianCha(String origin, String diff) {
        int i = 0;
        int j = 0;
        int pianCha = 0;
        while (i < origin.length() && j < diff.length()) {
            if (origin.charAt(i) != diff.charAt(j)) {
                while (origin.charAt(i) != ' ') {
                    i++;
                }
                while (diff.charAt(j) != ' ') {
                    j++;
                }
                pianCha++;
            } else if (origin.charAt(i) == diff.charAt(j)) {
                while (origin.charAt(i) != ' ' && diff.charAt(j) != ' ' && origin.charAt(i) == diff.charAt(j)) {
                    i++;
                    j++;
                }
                if (origin.charAt(i) == ' ' && diff.charAt(j) == ' ') {

                }else {
                    pianCha++;
                }
            } else if (origin.charAt(i) == ' ') {
                while (origin.charAt(i) == ' ') {
                    i++;
                }
            } else if (diff.charAt(j) == ' ') {
                while (diff.charAt(j) == ' ') {
                    j++;
                }
            }
        }
        return 1;
    }

    private static int getLength(String diff) {
        diff = diff.trim();
        int i = 0;
        int len = 0;
        while (i < diff.length()) {
            if (diff.charAt(i) >= '0' && diff.charAt(i) <= '9') {
                i++;
                while (diff.charAt(i) >= '0' && diff.charAt(i) <= '9') {
                    i++;
                }
                len++;
            } else if (dot.contains(diff.charAt(i))) {
                len++;
                i++;
            } else if (diff.charAt(i) == ' ') {
                while (diff.charAt(i) == ' ') {
                    i++;
                }
            } else {
                while ((diff.charAt(i) >= 'a' && diff.charAt(i) <= 'z') || (diff.charAt(i) >= 'A' && diff.charAt(i) <= 'Z')) {
                    i++;
                }
                len++;
            }

        }
        return len;
    }
}
