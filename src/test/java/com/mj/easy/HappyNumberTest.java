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
public class HappyNumberTest {

    private int input;

    private boolean result;

    private HappyNumber happyNumber;

    public HappyNumberTest(int input, boolean result) {
        this.input = input;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {19,true},
        });
    }

    @Before
    public void setUp() throws Exception {
        happyNumber = new HappyNumber();
    }

    @Test
    public void isHappy() {
        assertThat(result,is(happyNumber.isHappy(input)));
    }
}