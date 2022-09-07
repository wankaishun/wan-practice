package com.wan.algorithm.everyday;

import com.wan.algorithm.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author wan
 * @Description: 430. 扁平化多级双向链表
 * 多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
 *
 * 给你位于列表第一级的头节点，请你扁平化列表，使所有结点出现在单级双链表中。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * 输出：[1,2,3,7,8,11,12,9,10,4,5,6]
 * 解释：
 *
 * 输入的多级列表如下图所示：
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/flatten-a-multilevel-doubly-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021/9/24 10:01
 */
public class FlattenSolution {
    public static Node pre = new Node(1);
    public static Node flatten(Node head) {
        before(head);
        return pre.next;
    }
    public static void before(Node node) {
        if(node == null) {
            return;
        }
        pre.next = node;
        node.prev = pre;
        pre = node;
        before(node.child);
        before(node.next);
    }
    public static void main(String[] args) {
        Node node1 = new Node(1);

        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.prev = node1;
        node1.child = node3;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        long count = list.stream().filter(item -> Objects.equals(item,0)).count();
        System.out.println(count);
    }
}
