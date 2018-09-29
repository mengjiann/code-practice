package com.mj.easy;

import com.mj.easy.MaximumSubarray;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class MaximumSubarrayTest {

    private int[] nums;
    private int max;
    private MaximumSubarray maximumSubarray;

    public MaximumSubarrayTest(int[] nums, int max) {
        this.nums = nums;
        this.max = max;
    }

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {new int[]{-2,1,-3,4,-1,2,1,-5,4},6}
        });
    }

    @Before
    public void setUp() throws Exception {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    public void maximumSubarray() {
        assertThat(max, is(maximumSubarray.maximumSubarray(nums)));
    }
}