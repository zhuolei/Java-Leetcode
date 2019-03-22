package com.mercury.interview;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
    public static void main(String[] args) {
        Queue<Integer> l = new LinkedList<Integer>();
        System.out.println(solution("a a b b"));
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