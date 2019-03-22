package com.jiuzhang.java;

import java.util.HashSet;

public class Lintcode627 {
    public int solution(String s) {
        if (s == null || s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        return set.size() >= 0 ? s.length() - set.size() + 1 : s.length();
    }

}
