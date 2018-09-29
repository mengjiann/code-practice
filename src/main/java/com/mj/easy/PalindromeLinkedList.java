package com.mj.easy;

import java.util.Stack;

/**
 * https://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/
 */
public class PalindromeLinkedList {

    public boolean solutionUsingStack(Node head){
        if(head == null || head.next == null){
            return false;
        }

        return false;
    }

    public boolean solutionUsingReverse(Node head){

        return false;
    }

    public static class Node{
        public Integer data;
        public Node next;

        public Node(Integer data, Node next) {
            this.data = data;
            this.next = next;
        }
    }



}
