package com.wan.algorithm.linklist;

import com.wan.algorithm.ListNode;

/**
 * @author wan
 * @Description: 2.两数相加
 * @date 2021/9/10 14:39
 */
public class AddTwoNumbersSolution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode root = new ListNode(0);
        ListNode curr = new ListNode(0);
        root.next = curr;
        while(l1 != null || l2 != null) {
            int sum = 0;
            if(l1 == null) {
                  sum = l2.val +carry;
            }
            if(l2 == null) {
                  sum = l1.val +carry;
            }
            if(l1 != null && l2 != null) {
                sum = l1.val + l2.val +carry;
            }

            if(sum >= 10) {
                curr.next = new ListNode(sum - 10 );
                curr = curr.next;
                carry = 1;
            }else {
                curr.next = new ListNode(sum );
                curr = curr.next;
                carry = 0;
            }
            if(l1!= null) {
                l1 = l1.next;
            }
            if(l2!= null) {
                l2 = l2.next;
            }
        }
        if(carry == 1) {
            curr.next = new ListNode(1);
        }
        return root.next.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
//        l4.next = l5;
//        l5.next = l6;
//        l6.next = l7;
        ListNode i1 = new ListNode(9);
        ListNode i2 = new ListNode(9);
        ListNode i3 = new ListNode(9);
        ListNode i4 = new ListNode(9);
        i1.next = i2;
//        i2.next = i3;
//        i3.next = i4;
        System.out.println(addTwoNumbers(l1, i1));
    }
}
