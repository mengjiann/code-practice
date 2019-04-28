package com.mj.easy;

import com.apple.laf.AquaInternalFramePaneUI;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BinaryGapTest {

    private Integer inputNumber;
    private Integer result;

    private BinaryGap binaryGap;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {22,2},
                {5,2},
                {6,1}
        });
    }

    public BinaryGapTest(Integer inputNumber, Integer result) {
        this.inputNumber = inputNumber;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        binaryGap = new BinaryGap();
    }

    @Test
    public void binaryGap() {
        assertThat(result, is(binaryGap.binaryGap(inputNumber)));
    }
}