package com.mercury.interview;

public class DayOfWeek {
    public static String solution(String S,int K ) {
        if(S == null || K < 0) {
            return "";
        }
        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int remander = K % 7;
        int index = -1;
        for (int i = 0; i < week.length;i++) {
            if(S.equals(week[i])) {
                index = i;
            }
        }
        if (index != -1) {
            index = (index + remander) % 7;
            return week[index];
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(solution("Fri", 120));
    }
}
