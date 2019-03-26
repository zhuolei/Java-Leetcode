package com.jiuzhang.java;


import com.jiuzhang.java.removeDup.LinkedList;
import com.jiuzhang.java.removeDup.ListNode;

public class Main {
    public static void main(String[] args) {
        String s = "aaccccdd";
        Lintcode627 l627 = new Lintcode627();
        System.out.println(l627.solution(s));

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(5);
        ListNode n7 = new ListNode(9);
        ListNode head;
        head = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        LinkedList ll = new LinkedList();
        ll.print(n1);
        System.out.println();
        ll.removeDup(n1);
        // use cur to reference different node to get its value
        ll.print(n1);

    }
}
