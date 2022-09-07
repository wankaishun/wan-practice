package com.wan.algorithm.linklist;

import com.wan.algorithm.ListNode;

/**
 * @author wan
 * @Description: 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 示例 1：
 *
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 *
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 *
 * @date 2021/5/25 17:30
 */
public class MergeTwoListsSolution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode res;
        if(l1.val<l2.val) {
            res =  l1;
            res.next = mergeTwoLists(l1.next,l2);
        }else {
            res = l2;
            res.next = mergeTwoLists(l1, l2.next);
        }
        return res;
    }
}
