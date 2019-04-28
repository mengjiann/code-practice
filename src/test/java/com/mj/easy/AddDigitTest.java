package com.mj.easy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AddDigitTest {

    private int inputDigit;

    private int result;

    private AddDigit addDigit;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {38,2},
        });
    }

    public AddDigitTest(int inputDigit, int result) {
        this.inputDigit = inputDigit;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        addDigit = new AddDigit();
    }

    @Test
    public void addDigits() {

        assertThat(result, is(addDigit.addDigits(inputDigit)));

    }
}