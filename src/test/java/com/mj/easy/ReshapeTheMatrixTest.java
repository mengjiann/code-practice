package com.mj.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ReshapeTheMatrixTest {

    private int[][] nums;
    private int r;
    private int c;
    private int[][] result;

    private ReshapeTheMatrix reshapeTheMatrix;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {new int[][]{new int[]{1,2},new int[]{3,4}},2,4,new int[][]{new int[]{1,2},new int[]{3,4}}},
                {new int[][]{new int[]{1,2},new int[]{3,4}},1,4,new int[][]{new int[]{1,2,3,4}}},
                {new int[][]{new int[]{1,2},new int[]{3,4}},4,1,new int[][]{new int[]{1},new int[]{2},new int[]{3},new int[]{4}}}
        });
    }


    public ReshapeTheMatrixTest(int[][] nums, int r, int c, int[][] result) {
        this.nums = nums;
        this.r = r;
        this.c = c;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        reshapeTheMatrix = new ReshapeTheMatrix();
    }

    @Test
    public void matrixReshape() {
        Assert.assertThat(result, is(reshapeTheMatrix.matrixReshape(nums,r,c)));
    }
}