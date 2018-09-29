package com.mj.easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length < 1) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;
        int len = nums.length;


        while (start <= end) {
            if (nums[end] == val) { // Condition 1 - check the last digit
                end--;
                len--;
            } else if (nums[start] == val) { // Condition 2 - check the first
                nums[start] = nums[end];
                nums[end] = val;
            } else { // Condition 3 - increase start
                start++;
            }
        }
        return len;
    }
}
