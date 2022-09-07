package com.wan.algorithm;

public class Node {
   public int val;
   public Node next;
   public Node prev;
   public Node child;
   public Node() {}
   public Node(int val) { this.val = val; }




   public Node(int val, Node next, Node prev, Node child) {
      this.val = val;
      this.next = next;
      this.prev = prev;
      this.child = child;
   }
}
