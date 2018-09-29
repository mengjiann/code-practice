package com.mj.easy;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }

        int len = 0;
        int val = nums[len];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > val){
                if(i == len + 1){
                    len+=1;
                    val = nums[i];
                }else{
                    val = nums[i];
                    nums[len+1] = nums[i];
                    len+=1;
                }
            }
        }
        return len+1;
    }

    public int removeDuplicatesSimple(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }

        int len = 0;
        int val = nums[len];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[len]){
                len++;
                nums[len]=nums[i];
            }
        }
        return len+1;
    }



}
