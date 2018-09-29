package com.mj.easy;

public class MinStack {

    MinStack head;
    MinStack next;
    int min;
    int val;


    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if(head == null){
            head = new MinStack();
            head.val = x;
            head.min = x;
        }else{
            MinStack newHead = new MinStack();
            newHead.val = x;
            newHead.min = Math.min(x,head.min);
            newHead.next = head;
            head = newHead;
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return  head.min;
    }



}
