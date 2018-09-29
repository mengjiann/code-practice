package com.mj.easy;

public class MergeSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length < 0 || m < 0 || nums1.length != m + n){
            return new int[]{};
        }

        if(nums2.length < 1 || n < 1){
            return nums1;
        }

        m = m - 1;
        n = n - 1;

        for (int i = nums1.length -1 ; i >= 0 ; i--) {

            if(m < 0){
                nums1[i] = nums2[n];
                n--;
            }else if(n < 0){
                nums1[i] = nums1[m];
                m--;
            }else if(nums1[m] >= nums2[n]){
                nums1[i] = nums1[m];
                m--;
            }else{
                nums1[i] = nums2[n];
                n--;
            }
        }

        return nums1;
    }

}
