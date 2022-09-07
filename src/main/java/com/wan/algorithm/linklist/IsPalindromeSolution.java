package com.wan.algorithm.linklist;

import com.wan.algorithm.ListNode;

/**
 * @author wan
 * @Description: 判断回文链表
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnv1oc/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @date 2021/5/26 9:40
 */
public class IsPalindromeSolution {
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode fastNode = head;
        ListNode slowNode = head;
        while(fastNode!=null && fastNode.next != null && fastNode.next.next != null) {
            fastNode =fastNode.next.next;
            slowNode = slowNode.next;
        }
        ListNode middle = slowNode.next;
        ListNode head2 = reverse(middle);
        while(head2!=null) {
            if(head2.val != head.val){
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
//        ListNode listNode3 = new ListNode(3);
//        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(4);
//        ListNode listNode6 = new ListNode(3);
//        ListNode listNode7 = new ListNode(2);
//        ListNode listNode8 = new ListNode(1);
        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
//        listNode6.next = listNode7;
//        listNode7.next = listNode8;
        System.out.println(isPalindrome(listNode1));
    }
}
