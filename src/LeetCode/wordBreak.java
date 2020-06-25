package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class wordBreak {

    /**
     * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
     * 说明：
     * 拆分时可以重复使用字典中的单词。
     * 你可以假设字典中没有重复的单词。
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        // 类似01背包问题
        int n = s.length();
        // mem[i] 表示以i-1结尾字符串是否可以被wordDict拆分
        boolean[] mem = new boolean[n + 1];
        mem[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // 如果"onetwothree"这一段可以拆分，再加上four如果也可以，那不就行了；
                // 或者 如果"onetwothre"这一段可以拆分，再加上efour如果也可以，那不就行了；
                // 所以这个if表达式的意思就是 如果以j-1结尾的字符串可以被拆分，再加上j到i-1字符串也可以被wordDict拆分，那么就说以i结尾的字符串可以被拆分
                if (mem[j] && wordDict.contains(s.substring(j, i))) {
                    mem[i] = true;
                    break;
                }
            }
        }
        return mem[n];
    }

    public static boolean wordBreakPractice(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        // 初始化
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        wordBreakPractice(s, wordDict);
    }
}
