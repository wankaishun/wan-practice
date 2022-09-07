package com.wan.algorithm.everyday;

import com.wan.algorithm.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wan
 * @Description: 725. 分隔链表
 * 给你一个头结点为 head 的单链表和一个整数 k ，请你设计一个算法将链表分隔为 k 个连续的部分。
 *
 * 每部分的长度应该尽可能的相等：任意两部分的长度差距不能超过 1 。这可能会导致有些部分为 null 。
 *
 * 这 k 个部分应该按照在链表中出现的顺序排列，并且排在前面的部分的长度应该大于或等于排在后面的长度。
 *
 * 返回一个由上述 k 部分组成的数组。
 *
 *  
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3], k = 5
 * 输出：[[1],[2],[3],[],[]]
 * 解释：
 * 第一个元素 output[0] 为 output[0].val = 1 ，output[0].next = null 。
 * 最后一个元素 output[4] 为 null ，但它作为 ListNode 的字符串表示是 [] 。
 * 示例 2：
 *
 *
 * 输入：head = [1,2,3,4,5,6,7,8,9,10], k = 3
 * 输出：[[1,2,3,4],[5,6,7],[8,9,10]]
 * 解释：
 * 输入被分成了几个连续的部分，并且每部分的长度相差不超过 1 。前面部分的长度大于等于后面部分的长度。
 *  
 *
 * 提示：
 *
 * 链表中节点的数目在范围 [0, 1000]
 * 0 <= Node.val <= 1000
 * 1 <= k <= 50
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-linked-list-in-parts
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/22 13:47
 */
public class SplitListToPartsSolution {
    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode node = head;
        int length = 0;
        while(node != null) {
            length++;
            node = node.next;
        }
        ListNode[] result = new ListNode[k];
        int remainder = length%k;
        int shang = length/k;
        for (int i = 0; i < k; i++) {
            ListNode current = head;
            if(current == null) {
                break;
            }
            if(shang == 0) {
                result[i] = head;
                if(head != null) {
                    head = current.next;
                    current.next = null;
                }

            }else {
                result[i] = head;
                 if(i< remainder) {
                     int index = shang + 1;
                     while(index >1 ) {
                         current = current.next;
                         index --;
                     }
                     head = current.next;
                     current.next = null;
                 }else {
                     int index = shang;
                     while(index >1 ) {
                         current = current.next;
                         index --;
                     }
                     head = current.next;
                     current.next = null;
                 }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        ListNode head6 = new ListNode(6);
        ListNode head7 = new ListNode(7);
        ListNode head8 = new ListNode(8);
        ListNode head9 = new ListNode(9);
        ListNode head10 = new ListNode(10);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = head8;
        head8.next = head9;
        head9.next = head10;

        ListNode[] list = splitListToParts(head1, 3);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
