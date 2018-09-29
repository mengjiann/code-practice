package com.mj.easy;

import com.mj.easy.ReverseInteger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class ReverseIntegerTest {

    private Integer input;
    private Integer result;
    private ReverseInteger reverseInteger;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {123,321},
                {-9,-9},
                {-10,-1},
                {-123,-321},
                {-2147483648,0},
                {2147483647,0}
        });
    }

    public ReverseIntegerTest(Integer input, Integer result) {
        this.input = input;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void solution() {
        Assert.assertThat(result,is(reverseInteger.solution(input)));
    }
}