package com.wan.algorithm.linklist;

import com.wan.algorithm.ListNode;

/**
 * @author wan
 * @Description: 删除链表的倒数第N个节点
 * 删除链表的倒数第N个节点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 *
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 *
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 *  
 *
 * 提示：
 *
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 * 相关标签
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn2925/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * 1 2 3
 * @date 2021/5/25 9:38
 */
public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        if(head == null || head.next == null) {
//            return null;
//        }
//        ListNode first = head;
//        for(int i = 1; i<=n; i++) {
//              first = first.next;
//        }
//        if(first == null) {
//            return head.next;
//        }
//        ListNode last = head;
//        while(first.next!= null) {
//            last = last.next;
//            first = first.next;
//        }
//        last.next = last.next.next;
//
//        return head;
        return null;
    }

        public static void main(String[] args) {
            ListNode listNode1 = new ListNode(1);
            ListNode listNode2 = new ListNode(2);
            ListNode listNode3 = new ListNode(3);
            ListNode listNode4 = new ListNode(4);
            ListNode listNode5 = new ListNode(5);
            ListNode listNode6 = new ListNode(6);
            ListNode listNode7 = new ListNode(7);
            ListNode listNode8 = new ListNode(8);
            listNode1.next = listNode2;
            listNode2.next = listNode3;
            listNode3.next = listNode4;
            listNode4.next = listNode5;
            listNode5.next = listNode6;
            listNode6.next = listNode7;
            listNode7.next = listNode8;
            System.out.println(removeNthFromEnd(listNode1,8));
    }
}
