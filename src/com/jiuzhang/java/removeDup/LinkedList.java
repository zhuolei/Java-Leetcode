package com.jiuzhang.java.removeDup;

import java.util.HashSet;

public class LinkedList{

    public void print(ListNode head) {
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
    public void removeDup(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode cur = head;
        while(cur.next != null) {
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


    public void removeDup2(ListNode head) {
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

}


