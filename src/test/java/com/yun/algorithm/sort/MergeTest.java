package com.yun.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * @author Henry Gao
 * @date 2021-01-27 - 08:17
 */
public class MergeTest {

    private Merge mergeSort = new Merge();

    @Test
    public void testMergeSort(){
        String[] testArr1 = new String[]{"d","c", "z","e", "l","b"};
        mergeSort.process(testArr1);
        assertTrue(mergeSort.isSorted(testArr1));

    }

    @Test
    public void testMergeSort2(){
        Integer[] testArr1 = new Integer[]{12,3, 8,1, 2,9};
        mergeSort.process(testArr1);
        assertTrue(mergeSort.isSorted(testArr1));

    }

    @Test
    public void testMergeSort3(){
        Integer[] testArr1 = new Integer[]{};
        mergeSort.process(testArr1);
        assertTrue(mergeSort.isSorted(testArr1));
    }

    @Test
    public void testBottomUpMergeSort(){
        String[] testArr1 = new String[]{"d","c", "z","e", "l","b"};
        mergeSort.bottomUpSort(testArr1);
        assertTrue(mergeSort.isSorted(testArr1));
    }

    @Test
    public void testBottomUpMergeSort2(){
        Integer[] testArr1 = new Integer[]{12,3, 8,1, 2,9};
        mergeSort.bottomUpSort(testArr1);
        assertTrue(mergeSort.isSorted(testArr1));

    }

    @Test
    public void testBottomUpMergeSort3(){
        Integer[] testArr1 = new Integer[]{};
        mergeSort.bottomUpSort(testArr1);
        assertTrue(mergeSort.isSorted(testArr1));
    }
}