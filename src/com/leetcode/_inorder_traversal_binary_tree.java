package com.leetcode;
import java.util.*;

public class _inorder_traversal_binary_tree {
    /*
    94. Binary Tree Inorder Traversal
        Given the root of a binary tree, return the inorder traversal of its nodes' values.

        Example 1:
        Input: root = [1,null,2,3]

        Output: [1,3,2]
        Example 2:

        Input: root = []
        Output: []

        Example 3:

        Input: root = [1]
        Output: [1]

     */
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static java.util.ArrayList<java.lang.Integer> inorderTraversal(Node root){
        java.util.ArrayList<java.lang.Integer> lists = new ArrayList<Integer>();
        if(root!=null) {
            inorderTraversal(root.left);
            lists.add(root.val);
            inorderTraversal(root.right);
        }
        return lists;
    }
}
