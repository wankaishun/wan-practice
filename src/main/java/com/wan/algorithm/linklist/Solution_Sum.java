package com.wan.algorithm.linklist;

import com.wan.algorithm.ListNode;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 */
public class Solution_Sum {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode head = new ListNode();
        ListNode curr = head;
        //进位数字
        int i = 0;
        while(curr1 != null || curr2 != null || i ==1) {
            Integer value1 = 0;
            if(curr1!=null) {
                value1 = curr1.val;
                curr1 = curr1.next;
            }
            Integer value2 = 0;
            if(curr2!=null) {
                value2 = curr2.val;
                curr2 = curr2.next;
            }

            int sum = value1 + value2 + i;
            i = 0;
            if(sum>=10) {
                i = 1;
            }
            sum = sum%10;
            ListNode node = new ListNode(sum);
            curr.next = node;
            curr = node;

        }
        return head.next;
    }
    public static ListNode reverse(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode nextNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextNode;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);
        ListNode l8 = new ListNode(9);
        ListNode l9 = new ListNode(9);
        ListNode l10 = new ListNode(9);
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = l10;
        System.out.println(addTwoNumbers(l1, l2));
    }
}
