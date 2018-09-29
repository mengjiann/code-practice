package com.mj.easy;


import com.mj.easy.TwoSum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class TwoSumTest {
    private int[] resultArray;
    private int[] inputIntegerArray;
    private Integer target;
    private TwoSum twoSum;

    public TwoSumTest(int[] resultArray, int[] inputIntegerArray, Integer target) {
        this.resultArray = resultArray;
        this.inputIntegerArray = inputIntegerArray;
        this.target = target;
    }

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {new int[]{0,1},new int[]{2, 7, 11, 15},9},
        });
    }

    @Before
    public void setUp() throws Exception {
        twoSum = new TwoSum();
    }

    @Test
    public void twoSum() {
        Assert.assertThat(resultArray,is(twoSum.solution(inputIntegerArray,target)));
    }
}