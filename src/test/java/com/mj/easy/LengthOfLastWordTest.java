package com.mj.easy;

import com.mj.easy.LengthOfLastWord;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class LengthOfLastWordTest {

    String input;
    int len;
    LengthOfLastWord lengthOfLastWord;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {"Hello World",5},
                {"a",1}
        });
    }


    public LengthOfLastWordTest(String input, int len) {
        this.input = input;
        this.len = len;
    }

    @Before
    public void setUp() throws Exception {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    public void lengthOfLastWord() {
        Assert.assertThat(len,is(lengthOfLastWord.lengthOfLastWord(input)));
    }
}