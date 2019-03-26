package com.mercury.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Collections;
public class Test {
    public static boolean solution(String s) {
        if (s == null) return false;
        if (s.length() == 0) return true;

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (!check(s.charAt(left)) && left < right) {
                left++;
            }
            if (left == right) break;
            while (!check(s.charAt(right)) && left < right) {
                right--;
            }
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        if (left == right - 1) {
            return true;
        }
        return false;
    }
    public static boolean check(char c){
        return Character.isDigit(c) || Character.isLetter(c);
    }

    public static String longestPalindrome (String s) {
        if (s == null || s.length() == 0) return "";
        int start = 0, len = 0, longest = 0;
        for (int i = 0; i < s.length(); i++) {
            len = helper(s, i, i);
            if (len > longest) {
                longest = len;
                start = i - len/2;
            }
            len = helper(s, i, i+1);
            if (len > longest) {
                longest = len;
                start = i - len/2 + 1;
            }
        }
        return s.substring(start, start + longest);
    }
    public static int helper(String s, int left, int right) {
        int len = 0;
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            if (left == right) {
                len += 1;
            } else {
                len += 2;
            }
            left--;
            right++;
        }
        return len;
    }
    public static void main(String[] args) {
        Queue<Integer> l = new LinkedList<Integer>();


        System.out.println(longestPalindrome("abb"));
    }
}

abstract class Abstract{
    void Abstract(){

    }
    abstract class Inner{

    }

}

interface Interface{
    abstract class Inner{

    }
}