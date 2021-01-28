package com.yun.algorithm.sort.sortkata;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * @author Henry Gao
 * @date 2021-01-27 - 22:27
 */
public class sortKataTest {


    //SelectionSort
    private SelectionKata selectionSort = new SelectionKata();

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

    //InsertionSort
    private InsertionKata insertionSort = new InsertionKata();

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

    //ShellSort
    private ShellKata shellSort = new ShellKata();

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
    public void testShellSort3() {
        Integer[] testArr1 = new Integer[]{};
        shellSort.process(testArr1);
        assertTrue(shellSort.isSorted(testArr1));

    }

    //MergeSort
    private MergeKata mergeSort = new MergeKata();

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

    //QuickSort
    private QuickKata quickSort = new QuickKata();

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