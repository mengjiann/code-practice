package com.mj.easy;

import java.util.HashSet;

public class LinkedListCycle {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * 3 ways of solving this
     *
     * - Use hashing. - require additional space - O(n)
     * - Mark visited node. - require additional changes on the existing data structure.
     * - Floyd's Cycle Finding Algorithm. - no additional space.
     *
     */

    public boolean hasCycleHash(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode curr = head;

        while(curr != null){

            if(visited.contains(curr)){
                return true;
            }
            visited.add(curr);
            curr = curr.next;
        }
        return false;
    }

    public boolean hashCycleSlowaAndFaster(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.equals(fast)){
                return true;
            }


        }
        return false;
    }


}
