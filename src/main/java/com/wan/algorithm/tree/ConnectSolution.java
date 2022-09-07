package com.wan.algorithm.tree;


import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wan
 * @Description:
 * 116. 填充每个节点的下一个右侧节点指针
 * 给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 *
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 *
 * 初始状态下，所有 next 指针都被设置为 NULL。
 *
 *
 *
 * 示例 1：
 *
 *
 *
 * 输入：root = [1,2,3,4,5,6,7]
 * 输出：[1,#,2,3,#,4,5,6,7,#]
 * 解释：给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。序列化的输出按层序遍历排列，同一层节点由 next 指针连接，'#' 标志着每一层的结束。
 * 示例 2:
 *
 * 输入：root = []
 * 输出：[]
 * @date 2022/7/5 14:11
 */
public class ConnectSolution {
    public static Node connect(Node root) {
//          广度优先遍历
//        Deque<Node> deque = new LinkedList();
//        if(root == null) {return null;}
//        deque.offerLast(root);
//        while(!deque.isEmpty()) {
//            int size = deque.size();
//            for (int i = 0; i < size; i++) {
//                Node node = deque.pollFirst();
//                node.next = deque.peekFirst();
//                if(i == size -1) {
//                    node.next = null;
//                }
//                if(node.left!=null&&node.right !=null) {
//                    deque.offerLast(node.left);
//                    deque.offerLast(node.right);
//                }
//            }
//        }
//        return root;
        if(root == null) {
            return null;
        }
        re(root);
        return root;
    }
        public static void re(Node root) {
            Node item = root;
            while(item!= null) {
                if(item.left!=null) {
                    item.left.next = item.right;
                    if(item.next!=null){
                        item.right.next = item.next.left;
                    }
                }
                item = item.next;
            }
            if(root.left == null) {
                return;
            }else {
                re(root.left);
            }
        }
//                     1
//                   /  \
//                 2     3
//                / \   / \
//               4   5 6   7
        //阴阳怪气



    public static void main(String[] args) {
            Integer a= 1;
            System.out.println(Arrays.asList("1".split(",")).contains(String.valueOf(a)));
            System.out.println();

        Node root = new Node(1);
        Node root2 = new Node(2);
        Node root3 = new Node(3);
        Node root4 = new Node(4);
        Node root5 = new Node(5);
        Node root6 = new Node(6);
        Node root7 = new Node(7);
        root.left = root2;
        root.right = root3;
        root2.left = root4;
        root2.right = root5;
        root3.left = root6;
        root3.right = root7;
        connect(root);
        System.out.println();
    }
}
