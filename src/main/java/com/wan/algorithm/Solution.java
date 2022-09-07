package com.wan.algorithm;

public class Solution {
    public static ListNode oddEvenList1(ListNode head) {

        //迭代反转
/*        if(head == null || head.next == null) {
            return head;
        }
        ListNode preNode = null;
        ListNode currentNode = head;
        ListNode nextNode = null;
        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }
        return preNode;*/
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
        System.out.println(oddEvenList(listNode1));

    }

    /**
     * 判断是否是回文链表
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head){
        if(head == null || head.next == null) {
            return true;
        }
        //确定中心点
        ListNode middleNode = middleNode(head);
        //反转 中心点之后的链表
        ListNode reverseHead = reverse(middleNode.next);
        while(reverseHead.next != null) {
            if(head.val != reverseHead.val) {
                return false;
            }
            head = head.next;
            reverseHead = reverseHead.next;
        }

        return true;
    }

    /**
     * 反转链表
     * @param head
     * @return
     */
    public static ListNode reverse(ListNode  head) {
        //递归反转链表
      /*  if (head.next == null || head == null) return head;
        ListNode last = oddEvenList(head.next);
        head.next.next = head;
        head.next = null;
        return last;*/
        if (head.next == null || head == null) return head;
        ListNode preNode = null;
        ListNode curNode = head;
        while(curNode != null) {
            ListNode nextNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        return preNode;
    }

    /**
     * 根据快慢指针返回中心节点
     * @param head
     * @return
     */
    public static ListNode middleNode(ListNode head) {
        /*快慢指针确定中心节点*/

        ListNode slowNode  = head.next;
        ListNode fastNode = head.next.next;

        while(fastNode != null && fastNode.next !=null &&fastNode.next.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }

    /**
     * 奇偶链表
     * 入参 1 2 3 4 5 6 7
     * 出参 1 3 5 7 2 4 6
     * @param head
     * @return
     */
    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode oddNode = head;
        ListNode evenNode = head.next;
        ListNode t = evenNode;
        while(evenNode != null && evenNode.next!= null) {
            oddNode.next = oddNode.next.next;
            oddNode = oddNode.next;
            evenNode.next = evenNode.next.next;
            evenNode = evenNode.next;
        }
        oddNode.next = t;
        return head;
    }
}
