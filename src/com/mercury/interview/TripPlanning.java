package com.mercury.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TripPlanning {
    public static int[] solution(int[] T) {

        if(T == null || T.length == 0) return new int[0];

        int capital = -1;
        int[] result = new int[T.length - 1];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < T.length; i++) {
            if(i == T[i]) {
                capital = i;
            }
            map.put(i, new ArrayList<Integer>());
        }
        for(int i = 0; i < T.length; i++) {
            if(capital == i) {
                continue;
            }
            map.get(i).add(T[i]);
            map.get(T[i]).add(i);
        }
        if(capital == -1) {
            return null;
        }
        map.forEach((k,v) -> {
            System.out.println(k + "-->" + v);
        });
        queue.add(capital);
        set.add(capital);
        int distance = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                int current = queue.poll();
                if(!map.containsKey(current)) continue;
                for(int value: map.get(current)) {
                    if(!set.contains(value)) {
                        set.add(value);
                        queue.add(value);
                        result[distance]++;
                    }
                }

            }

            distance++;

        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1, 4};
        int[] arr1 = {9, 1, 4, 9, 0, 4, 8, 9, 0, 1};
        for(int i : solution(arr)) {
            System.out.print(i + ",");
        }

    }
}
