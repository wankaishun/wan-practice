package com.wan.algorithm.linklist;

import com.wan.algorithm.ListNode;
import reactor.core.publisher.Mono;

/**
 * @author wan
 * @Description:83. 删除排序链表中的重复元素
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
 *
 * 返回同样按升序排列的结果链表。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,1,2]
 * 输出：[1,2]
 * 示例 2：
 *
 *
 * 输入：head = [1,1,2,3,3]
 * 输出：[1,2,3]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/12/23 9:44
 */
public class DeleteDuplicatesSolution {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode pre = head;
        ListNode cur = head;
        while(cur !=null ) {

            if(pre.val != cur.val) {
                pre.next = cur;
                pre = cur;
            }
            cur = cur.next;
            if(cur == null) {
                pre.next = null;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        System.out.println(deleteDuplicates(l1));
    }
}
