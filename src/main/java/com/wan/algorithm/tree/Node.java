package com.wan.algorithm.tree;

/**
 * @author wan
 * @Description:
 * @date 2022/7/5 14:13
 */
public class Node {
      int value;
      Node left;
      Node right;
      Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node left, Node right, Node next) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.next = next;
    }
}
