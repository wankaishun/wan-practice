package com.wan.algorithm.linklist;

import com.wan.algorithm.ListNode;


public class MergeLinkList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 1 3 6 7 8 8
        // 3 6 7 7 9 10
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode res;
        if(l1.val < l2.val) {
            res = l1;
            res.next = mergeTwoLists(l1.next, l2);
        }else {
            res = l2;
            res.next = mergeTwoLists(l1, l2.next);
        }
            return res;
    }
}
