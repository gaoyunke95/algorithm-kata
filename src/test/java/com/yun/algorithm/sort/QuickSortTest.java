package com.yun.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * @author Henry Gao
 * @date 2021-01-27 - 19:29
 */
public class QuickSortTest {

    private Quick quickSort = new Quick();

    @Test
    public void testQuickSort(){
        String[] testArr1 = new String[]{"d","c", "z","e", "l","b"};
        quickSort.process(testArr1);
        assertTrue(quickSort.isSorted(testArr1));

    }

    @Test
    public void testQuickSort2(){
        Integer[] testArr1 = new Integer[]{12,3, 8,1, 2,9};
        quickSort.process(testArr1);
        assertTrue(quickSort.isSorted(testArr1));

    }

    @Test
    public void testQuickSort3(){
        Integer[] testArr1 = new Integer[]{};
        quickSort.process(testArr1);
        assertTrue(quickSort.isSorted(testArr1));
    }

    @Test
    public void testThreeWayQuickSort(){
        String[] testArr1 = new String[]{"d","c", "z","e", "l","b"};
        quickSort.threeWayQuickSort(testArr1);
        assertTrue(quickSort.isSorted(testArr1));

    }

    @Test
    public void testThreeWayQuickSort2(){
        Integer[] testArr1 = new Integer[]{12,3, 8,1, 2,9};
        quickSort.threeWayQuickSort(testArr1);
        assertTrue(quickSort.isSorted(testArr1));
    }

    @Test
    public void testThreeWayQuickSort3(){
        Integer[] testArr1 = new Integer[]{};
        quickSort.threeWayQuickSort(testArr1);
        assertTrue(quickSort.isSorted(testArr1));
    }


}