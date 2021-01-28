package com.yun.algorithm.sort;

/**
 * @author Henry Gao
 * @date 2021-01-18 - 12:10
 */
public interface SortAlgTemplate {

    void sort(Comparable[] arr);
    boolean less(Comparable var1, Comparable var2);
    void exchange(Comparable[] arr, int i, int j);
    boolean isSorted(Comparable[] arr);
    void show(Comparable[] arr);
    void process(Comparable[] args);
}
