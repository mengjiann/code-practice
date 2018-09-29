package com.mj.easy;

import com.mj.easy.Fibonacci;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class FibonacciTest {
    private Integer inputNumber;
    private Integer expectedValue;
    private Fibonacci fibonacci;

    public FibonacciTest(Integer inputNumber, Integer expectedValue) {
        this.inputNumber = inputNumber;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Collection fibonacciSequence(){
        return Arrays.asList(new Object[][]{
                {0,1},
                {1,1},
                {2,2},
                {3,3},
                {4,5},
                {5,8},
                {6,13},
                {7,21}
        });
    }

    @Before
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void getValueAtIndexRecursive(){
        Assert.assertThat(expectedValue,is(fibonacci.getValueAtIndexRecursive(inputNumber)));
    }

    @Test
    public void getValueAtIndexRecursiveMemoization(){
        Assert.assertThat(expectedValue,is(fibonacci.getValueAtIndexRecursiveMemoization(inputNumber)));
    }

    @Test
    public void getValueAtIndexIterative(){
        Assert.assertThat(expectedValue,is(fibonacci.getValueAtIndexIterative(inputNumber)));
    }

}