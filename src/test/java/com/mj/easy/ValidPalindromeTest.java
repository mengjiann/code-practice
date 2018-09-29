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
public class ValidPalindromeTest {

    private String input;
    private Boolean result;
    private ValidPalindrome validPalindrome;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {"A man, a plan, a canal: Panama",true},
        });
    }

    public ValidPalindromeTest(String input, Boolean result) {
        this.input = input;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        validPalindrome = new ValidPalindrome();
    }

    @Test
    public void isPalindrome() {
        assertThat(result,is(validPalindrome.isPalindrome(input)));
    }
}