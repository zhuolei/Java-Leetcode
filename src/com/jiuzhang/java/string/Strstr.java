package com.jiuzhang.java.string;

// For a given source string and a target string,
// you should output the first index(from 0) of target string in source string.
//If target does not exist in source, just return -1.
public class Strstr {
    public int strStr(String source, String target) {
        if (source == null || target == null) return -1;
        if (target.length() > source.length()) return -1;
        for (int i = 0; i < source.length() - target.length() + 1; i++) {
            int j;
            for (j = 0; j < target.length(); j++) {
                if (target.charAt(i + j) != source.charAt(j)) {
                    break;
                }
            }
            if (j == target.length()) return i;
        }
        return -1;
    }
}
