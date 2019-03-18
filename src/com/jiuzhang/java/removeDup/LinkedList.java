package com.jiuzhang.java.removeDup;

import java.util.HashSet;

public class LinkedList{
    static void print(ListNode head) {
        ListNode cur = head;
        while(cur != null) {
            if(cur.next == null) {
                System.out.print(cur.val + ".");
            } else {
                System.out.print(cur.val + ",");
            }
            cur = cur.next;
        }
    }
    static void removeDup(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode cur = head;
        while(cur != null) {
            ListNode run = cur;
            while(run.next != null) {
                if(run.next.val == cur.val) {
                    run.next = run.next.next;
                } else {
                    run = run.next;
                }
            }
            cur = cur.next;
        }
    }
    static void removeDup2(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode cur = head;
        ListNode pre = null;
        HashSet<Integer> set = new HashSet<>();
        while(cur != null) {
            if (!set.contains(cur.val)) {
                set.add(cur.val);
                pre = cur;
            } else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(5);
        ListNode n7 = new ListNode(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        print(n1);
        System.out.println();
        removeDup2(n1);
        // use cur to reference different node to get its value
        print(n1);
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
