package com.mj.easy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class StringCompressionTest {

    private char[] input;
    private int result;

    private StringCompression stringCompression;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {new char[]{'a','a','b','b','c','c','c'},6},
                {new char[]{'a'},1},
                {new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'},4},

        });
    }

    public StringCompressionTest(char[] input, int result) {
        this.input = input;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        stringCompression = new StringCompression();

    }

    @Test
    public void compress() {

        assertThat(result,is(stringCompression.compress(input)));

    }
}