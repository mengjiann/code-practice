package com.mj.easy;

import com.mj.easy.PlusOne;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class PlusOneTest {

    private int[] input;
    private int[] result;
    private PlusOne plusOne;

    public PlusOneTest(int[] input, int[] result) {
        this.input = input;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,3,4},new int[]{1,2,3,5}},
                {new int[]{9,9,9,9},new int[]{1,0,0,0,0}},
                {new int[]{},new int[]{}},
                {new int[]{0},new int[]{1}},
        });
    }

    @Before
    public void setUp() throws Exception {
        plusOne = new PlusOne();
    }

    @Test
    public void plusOne() {

        assertThat(result,is(plusOne.plusOne(input)));

    }
}