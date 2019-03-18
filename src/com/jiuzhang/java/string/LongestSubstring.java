package com.jiuzhang.java.string;

import java.util.HashSet;

// 最长回文字符串
// Given a string which consists of lowercase or uppercase letters,
// find the length of the longest palindromes that can be built with those letters.
public class LongestSubstring {
    public int solution (String s) {
        if (s == null || s.length() == 0) return 0;

        HashSet<Character> set = new HashSet<>();
        int result = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (set.contains(c[i])) {
                set.remove(c[i]);
            } else {
                set.add(c[i]);
            }
        }

        return 0 > set.size() - 1 ? s.length() - 0: s.length() - set.size() + 1;
    }
}
