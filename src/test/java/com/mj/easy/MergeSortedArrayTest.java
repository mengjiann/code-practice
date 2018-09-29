package com.mj.easy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class MergeSortedArrayTest {

    private int[] nums1;
    private int m;
    private int[] nums2;
    private int n;
    private int[] result;

    private MergeSortedArray mergeSortedArray;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                { new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3,new int[]{1,2,2,3,5,6}},
                { new int[]{2,0},1,new int[]{1},1,new int[]{1,2}},
                { new int[]{0},0,new int[]{1},1,new int[]{1}},
                { new int[]{-1,0,0,3,3,3,0,0,0},6,new int[]{1,2,2},3,new int[]{-1,0,0,1,2,2,3,3,3}},
        });
    }

    public MergeSortedArrayTest(int[] nums1, int m, int[] nums2, int n, int[] result) {
        this.nums1 = nums1;
        this.m = m;
        this.nums2 = nums2;
        this.n = n;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    public void merge() {
        assertThat(result, is(mergeSortedArray.merge(nums1,m,nums2,n)));
    }
}