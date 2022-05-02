package com.leetcode;
import java.util.*;

public class _Add_Two_Numbers_ {
    /*
    2. Add Two Numbers

    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.


    Example 1:
    Input: l1 = [2,4,3], l2 = [5,6,4]

    Output: [7,0,8]
    Explanation: 342 + 465 = 807.

    Example 2:
    Input: l1 = [0], l2 = [0]
    Output: [0]
    Example 3:

    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    Output: [8,9,9,9,0,0,0,1]
     */
    private class Node{
        int val;
        Node next;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }

    public static Node sum(Node l1,Node l2){
        Node head = l1;
        int carryover = 0;
        while(l1 != null){
            l1.val = num1 + num2 + carryover;
            carryover = l1.val / 10;
            l1.val = l1.val - (carryOver * 10);

            if(l1.next == null && (carryOver == 1 || l2.next != null)){
                l1.next = new ListNode(carryOver);
            }
            l1 = l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return head;
    }
}
