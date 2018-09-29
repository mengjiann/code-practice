package com.mj.easy;

import com.mj.easy.LongestCommonPrefix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class LongestCommonPrefixTest {

    private String[] input;
    private String result;

    LongestCommonPrefix longestCommonPrefix;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {new String[]{},""},
                {new String[]{"dog","racecar","car"},""},
                {new String[]{"flower","flow","flight"},"fl"}
        });
    }

    public LongestCommonPrefixTest(String[] input, String result) {
        this.input = input;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void longestCommonPrefix() {
        Assert.assertThat(result, is(longestCommonPrefix.longestCommonPrefix(input)));

    }
}