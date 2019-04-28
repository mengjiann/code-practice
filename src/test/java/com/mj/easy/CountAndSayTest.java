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
public class CountAndSayTest {

    private Integer n;
    private String result;

    private CountAndSay countAndSay;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {1,"1"},
                {2,"11"},
                {3,"21"},
                {4,"1211"},
                {5,"111221"}
        });
    }

    public CountAndSayTest(Integer n, String result) {
        this.n = n;
        this.result = result;
    }

    @Before
    public void setUp() throws Exception {
        countAndSay = new CountAndSay();
    }

    @Test
    public void countAndSay() {
        assertThat(result,is(countAndSay.countAndSay(n)));
    }
}