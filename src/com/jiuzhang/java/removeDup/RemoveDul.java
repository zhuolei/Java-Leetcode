package com.jiuzhang.java.removeDup;


public class RemoveDul{
    public static void removeDul(ListNode head) {
        ListNode cur = head;
        while(cur != null){
            ListNode run = cur;
            while(run.next != null) {
                if(cur.val == run.next.val){
                    run.next = run.next.next;
                } else {
                    run = run.next;
                }
            }
            cur = cur.next;
        }
    }
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
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(1);
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
        removeDul(n1);
        // use cur to reference different node to get its value
        print(n1);
    }
}
