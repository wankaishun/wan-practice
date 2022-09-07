package com.wan.algorithm.everyday;

import com.wan.algorithm.ListNode;

/**
 * @author wan
 * @Description: 剑指 Offer 22. 链表中倒数第k个节点
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 *
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 *
 *  
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 *
 * 返回链表 4->5.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/2 17:36
 *
 */
public class GetKthFromEndSolution {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null) {
            return head;
        }
        if(head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        int i = 0;
        while(fast.next != null) {
            i++;
            if(i >= k) {
                slow = slow.next;
            }
            fast = fast.next;

        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        System.out.println(getKthFromEnd(l1, 2));

    }
}
