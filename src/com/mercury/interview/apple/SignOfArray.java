package com.mercury.interview.apple;

public class SignOfArray {
    public static int solution(int[] A) {
        if(A.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == 0) {
                return 0;
            }
            if (A[i] < 0) {
                count++;
            }
        }
        if(count % 2 == 0) {
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {-1, -1, -3};
        System.out.println(solution(A));
    }
}

