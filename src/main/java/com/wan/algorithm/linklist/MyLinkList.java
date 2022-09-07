package com.wan.algorithm.linklist;

class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;


    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.pre = head;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index<0 || index>= size) {
            return -1;
        }
     return getCurNode(index).getValue();
    }

    private Node getCurNode(int index) {
        int point = 0;
        Node cur = head;
        while(point != index){
            cur = cur.next;
            point++;
        }
        return cur;
    }
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {

        addAtIndex(0,val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size-1,val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index<=0) {
            Node node = new Node(val);
            node.next = head;
            head.pre = node;
            this.head = node;
            size++;
            return;
        }
        if(index>size){
            return;
        }
        if(index == size) {
            //TODO
        }
        Node node = new Node(val);
        Node cur = getCurNode(index);
        cur.pre.next  = node;
        node.pre = cur.pre;
        node.next = cur;
        cur.pre = node;
        size++;

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
          Node cur = getCurNode(index) ;
          cur.pre.next =cur.next;
          cur.next.pre=cur.pre;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */