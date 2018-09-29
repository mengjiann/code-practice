package com.mj.easy;

public class MaximumSubarray {

    public int maximumSubarray(int[] nums){
        int max = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(sum + nums[i] > nums[i]){
                sum = sum + nums[i];
            }else{
                sum = nums[i];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
