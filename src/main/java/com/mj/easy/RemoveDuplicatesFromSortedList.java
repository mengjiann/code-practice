package com.mj.easy;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeDuplicatesFromSortedList(ListNode head) {
        if(head == null){
            return head;
        }
        Map<Integer, Integer> duplicates = new HashMap<>();

        ListNode result = new ListNode(head.val);
        ListNode curr = head.next;
        ListNode resultCurr = result;

        duplicates.put(head.val,1);

        while(curr != null){
            int val = curr.val;
            if(duplicates.get(val) == null ){ // Not found duplicate
                duplicates.put(val,1);
                resultCurr.next = new ListNode(val);
                resultCurr = resultCurr.next;
            }
            curr = curr.next;
        }

        return result;
    }


    public ListNode removeDuplicatesFromSortedListFast(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode p = head;
        ListNode q = head.next;

        while(p != null){

            while(q != null && p.val == q.val){
                q = q.next;
            }

            p.next = q;
            p = p.next;

        }

        return head;
    }



}
