package com.mj.easy;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class RemoveDuplicatesFromSortedListTest {


    private RemoveDuplicatesFromSortedList.ListNode input;
    private Integer[] output;
    private RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {new RemoveDuplicatesFromSortedList.ListNode(1,
                        new RemoveDuplicatesFromSortedList.ListNode(1,
                                new RemoveDuplicatesFromSortedList.ListNode(2,null))),new Integer[]{1,2}},
                {new RemoveDuplicatesFromSortedList.ListNode(1,
                        new RemoveDuplicatesFromSortedList.ListNode(1, null)),new Integer[]{1}}
        });
    }

    public RemoveDuplicatesFromSortedListTest(RemoveDuplicatesFromSortedList.ListNode input, Integer[] output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setUp() throws Exception {
        removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
    }

    @Test
    public void removeDuplicatesFromSortedList() {
        assertThat(output,is(toIntArray(removeDuplicatesFromSortedList.removeDuplicatesFromSortedList(input))));
    }

    @Test
    public void removeDuplicatesFromSortedListFast() {
        assertThat(output,is(toIntArray(removeDuplicatesFromSortedList.removeDuplicatesFromSortedListFast(input))));
    }

    private Integer[] toIntArray(RemoveDuplicatesFromSortedList.ListNode head){
        List<Integer> integers = new ArrayList<>();
        RemoveDuplicatesFromSortedList.ListNode curr = head;
        while(curr!=null){
            integers.add(curr.val);
            curr = curr.next;
        }
        return integers.toArray(new Integer[integers.size()]);
    }


}