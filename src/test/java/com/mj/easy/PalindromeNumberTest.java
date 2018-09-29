package com.mj.easy;

import com.mj.easy.PalindromeNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class PalindromeNumberTest {

    private boolean expectedResult;
    private int inputValue;
    private PalindromeNumber palindromeNumber;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {true,121},
                {false,-121},
                {true,1221}
        });
    }

    public PalindromeNumberTest(boolean expectedResult, int inputValue) {
        this.expectedResult = expectedResult;
        this.inputValue = inputValue;
    }

    @Before
    public void setUp() throws Exception {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void solution() {
        Assert.assertThat(expectedResult,is(palindromeNumber.solution(inputValue)));
    }

    @Test
    public void solutionWithoutString(){
        Assert.assertThat(expectedResult,is(palindromeNumber.solutionWithoutString(inputValue)));
    }

}