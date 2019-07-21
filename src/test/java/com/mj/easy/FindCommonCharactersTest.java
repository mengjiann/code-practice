package com.mj.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FindCommonCharactersTest {

    private String[] input;
    private List<String> result;

    FindCommonCharacters findCommonCharacters;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {new String[]{"bella","label","roller"},Arrays.asList("e","l","l")},
                {new String[]{"cool","lock","cook"},Arrays.asList("c","o")}
        });
    }

    public FindCommonCharactersTest(String[] input, List<String> result) {
        this.input = input;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        findCommonCharacters = new FindCommonCharacters();
    }

    @Test
    public void commonChars() {
        Assert.assertThat(result,is(findCommonCharacters.commonChars(input)));
    }
}