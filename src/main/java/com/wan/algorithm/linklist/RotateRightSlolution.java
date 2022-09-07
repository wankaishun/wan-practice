package com.wan.algorithm.linklist;

import com.wan.algorithm.ListNode;

/**
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[4,5,1,2,3]
 */
public class RotateRightSlolution {
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode cur = head;
        if(k == 0 || head == null || head.next == null) {
            return head;
        }
        int lenth = 0;
        ListNode tail = null;
        while(cur != null) {
            tail = cur;
            cur = cur.next;
            lenth ++;

        }
        if(k%lenth == 0) {
            return head;
        }
        int cut = k%lenth;
        cur = head;
        int j = 0;
        while(cur != null) {
            j++;
            if(j == lenth - cut) {
                break;
            }
            cur = cur.next;
        }
        tail.next = head;
        head = cur.next;
        cur.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        System.out.println(rotateRight(l1, 2));
    }
}
