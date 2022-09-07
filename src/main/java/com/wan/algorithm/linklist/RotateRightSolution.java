package com.wan.algorithm.linklist;

import com.wan.algorithm.ListNode;

/**
 * @author wan
 * @Description:
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[4,5,1,2,3]
 * 示例 2：
 *
 *
 * 输入：head = [0,1,2], k = 4
 * 输出：[2,0,1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/rotate-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2022/8/9 17:25
 */
public class RotateRightSolution {
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode quickNode = head;
        if(head == null || head.next == null || k == 0) {
            return head;
        }
        while( k != 0) {
            quickNode = quickNode.next;
            if(quickNode == null) {
                quickNode = head;
            }
             k --;
        }
        if(quickNode == head) {
            return head;
        }
        ListNode slowNode = head;
        while(quickNode.next != null) {
            quickNode = quickNode.next;
            slowNode = slowNode.next;
        }
        ListNode newHead = slowNode.next;
        slowNode.next = null;
        quickNode.next = head;

        return newHead;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        ListNode listNode = rotateRight(node1, 2);
        System.out.println(listNode);


    }
}
