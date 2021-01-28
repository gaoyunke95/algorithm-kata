package com.yun.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


/**
 * @author Henry Gao
 * @date 2021-01-18 - 16:33
 */
public class ShellTest {

    private Shell shellSort = new Shell();

    @Test
    public void testShellSort(){
        String[] testArr1 = new String[]{"d","c", "z","e", "l","b"};
        shellSort.process(testArr1);
        assertTrue(shellSort.isSorted(testArr1));

    }

    @Test
    public void testShellSort2(){
        Integer[] testArr1 = new Integer[]{12,3, 8,1, 2,9};
        shellSort.process(testArr1);
        assertTrue(shellSort.isSorted(testArr1));

    }

    @Test
    public void testShellSort3(){
        Integer[] testArr1 = new Integer[]{};
        shellSort.process(testArr1);
        assertTrue(shellSort.isSorted(testArr1));

    }
}