package com.mj.easy;

import com.mj.easy.PalindromeLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class PalindromeLinkedListTest {

    private boolean expectedResult;
    private PalindromeLinkedList.Node head;
    private PalindromeLinkedList palindromeLinkedList;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {false,null},
                {false,new PalindromeLinkedList.Node(1,null)},
                {true,new PalindromeLinkedList.Node(1,new PalindromeLinkedList.Node(2,new PalindromeLinkedList.Node(1,null)))}
        });
    }

    public PalindromeLinkedListTest(boolean expectedResult, PalindromeLinkedList.Node head) {
        this.expectedResult = expectedResult;
        this.head = head;
    }

    @Before
    public void setUp() throws Exception {
        palindromeLinkedList = new PalindromeLinkedList();
    }

    @Test
    public void solutionUsingStack() {
        Assert.assertThat(expectedResult,is(palindromeLinkedList.solutionUsingStack(head)));
    }

    @Test
    public void solutionUsingReverse() {
        Assert.assertThat(expectedResult,is(palindromeLinkedList.solutionUsingReverse(head)));
    }
}