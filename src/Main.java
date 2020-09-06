import java.util.*;

/**
 * 笔试用
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> temp = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals("")) {
                break;
            }
            temp.add(s);
        }
        String lastNumberString = temp.get(temp.size() - 1);
        String A = temp.get(temp.size() - 2);
        String teZhengZhiOfLastString = findteZhengZhiOfString(A, lastNumberString);
        Map<String, String> map = new LinkedHashMap<>();
        for (int j = 0; j < temp.size() - 2; j++) {
            String s = findteZhengZhiOfString(A, temp.get(j));
            map.put(temp.get(j), s);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().contains(teZhengZhiOfLastString)) {
                System.out.println(entry.getKey());
            }
        }
    }

    private static String findteZhengZhiOfString(String A, String lastNumberString) {
        StringBuilder teZhengZhiOfLastString = new StringBuilder();
        int i = 0;
        while (i < lastNumberString.length()) {
            String c = String.valueOf(lastNumberString.charAt(i));
            if (A.compareTo(c) > 0) {
                teZhengZhiOfLastString.append(c);
            }
            i++;
        }
        return teZhengZhiOfLastString.toString();
    }
}
