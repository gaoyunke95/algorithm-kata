package com.yun.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


/**
 * @author Henry Gao
 * @date 2021-01-18 - 16:22
 */
public class InsertionTest {
    private Insertion insertionSort = new Insertion();

    @Test
    public void testInsertionSort(){
        String[] testArr1 = new String[]{"d","c", "z","e", "l","b"};
        insertionSort.process(testArr1);
        assertTrue(insertionSort.isSorted(testArr1));


    }

    @Test
    public void testInsertionSort2(){
        Integer[] testArr1 = new Integer[]{12,3, 8,1, 2,9};
        insertionSort.process(testArr1);
        assertTrue(insertionSort.isSorted(testArr1));
    }

    @Test
    public void testInsertionSort3(){
        Integer[] testArr1 = new Integer[]{};
        insertionSort.process(testArr1);
        assertTrue(insertionSort.isSorted(testArr1));

    }

}