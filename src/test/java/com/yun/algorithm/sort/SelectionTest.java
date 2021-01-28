package com.yun.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;


/**
 * @author Henry Gao
 * @date 2021-01-18 - 15:08
 */
public class SelectionTest {

    private Selection selectionSort = new Selection();

    @Test
    public void testSelectionSort(){
        String[] testArr1 = new String[]{"d","c", "z","e", "l","b"};
        selectionSort.process(testArr1);
        assertTrue(selectionSort.isSorted(testArr1));

    }

    @Test
    public void testSelectionSort2(){
        Integer[] testArr1 = new Integer[]{12,3, 8,1, 2,9};
        selectionSort.process(testArr1);
        assertTrue(selectionSort.isSorted(testArr1));

    }

    @Test
    public void testSelectionSort3(){
        Integer[] testArr1 = new Integer[]{};
        selectionSort.process(testArr1);
        assertTrue(selectionSort.isSorted(testArr1));
    }


}