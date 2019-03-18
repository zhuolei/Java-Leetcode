package com.jiuzhang.java.removeDup;

import java.util.HashMap;

public class RemoveString {

    public static Character removeDup(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(i, map.getOrDefault(1, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(i) == 1) {
                return s.charAt(i);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        String s = "aSSS";
        System.out.println(removeDup(s));
        System.out.println(s instanceof Object);
    }
}
