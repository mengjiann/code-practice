package com.mj.easy;

import com.mj.easy.AddBinary;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class AddBinaryTest {

    private String first;
    private String second;
    private String result;

    private AddBinary addBinary;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {"0","1","1"},
                {"1","1","10"},
                {"1","10","11"},
                {"1010","1011","10101"},
        });
    }

    public AddBinaryTest(String first, String second, String result) {
        this.first = first;
        this.second = second;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        addBinary = new AddBinary();
    }

    @Test
    public void addBinaryApi() {
        assertThat(result, is(addBinary.addBinaryApi(first,second)));
    }

    @Test
    public void addBinaryNonApi() {
        assertThat(result, is(addBinary.addBinaryNonApi(first,second)));
    }
}