package com.jiuzhang.java.string;

// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
// 使用两根指针遍历整个字符串即可.
//
//  假定有指针i, j, 其中i是从前往后遍历, j是从后往前遍历.
//
//  当i在j左边时继续循环, 每一次将i右移到数字/字母上, j左移到数字/字母上,
//
//  比较二者对应的字符串内的字符是否相同, 不相同则原字符串不是回文串.
//
//  如果全部的比较都相同, 说明是回文串.
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < s.length() && !isValid(s.charAt(left))) {
                left++;
            }
            if (left == s.length()) {
                return true;
            }
            while (right >= 0 && !isValid(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }

    public boolean isValid(char c) {
        return Character.isDigit(c) || Character.isLetter(c);
    }
}
