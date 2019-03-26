package com.mercury.interview;

import com.mercury.interview.apple.Card;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void sort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int temp = A[i];
            int j = i;
            while (j > 0 && temp < A[j-1]) {
                A[j] = A[j-1];
                j = j-1;
            }
            A[j] = temp;
        }
    }
    public static int lastPosition(int[] nums, int target) {
        int start = 0, end = nums.length - 1, index = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) {
                index = mid;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Comparator<Card> c = (a, b) -> {
            return a.face.compareTo(b.face);
        };
        int[] A = {1, 9, 10, 5, 4};
        int[] nums = {1,1};

        sort(A);
//        selectionSort(A);
        for (int i : A) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(lastPosition(nums, 1));
        //JDK8中有双冒号的用法，就是把方法当做参数传到stream内部，使stream的每个元素都传入到该方法里面执行一下。
        Stream.of(A).peek(System.out::print).collect(Collectors.toList());
//        List<String> l = Stream.of("B", "A", "C")
//                .sorted()
//                .peek(System.out::print)
//                .collect(Collectors.toList());
    }
}
