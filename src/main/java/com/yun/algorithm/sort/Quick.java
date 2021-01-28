package com.yun.algorithm.sort;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Random;

/**
 * @author Henry Gao
 * @date 2021-01-27 - 14:20
 */
public class Quick extends DefaultSortAlgTemplate{

    @Override
    public void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);

    }


    private void sort(Comparable[] a, int lo, int hi){
        if(lo >= hi) return ;
        // j will be the position of the comparable value
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private int partition(Comparable[] a, int lo, int hi){
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while(true){
            while(less(a[++i], v)) if(i == hi) break;
            while(less(v,a[--j])) if(j == lo) break;
            if(i >= j ) break;
            exchange(a, i , j);
        }
        exchange(a, lo , j);
        return j;
    }

    //threeWayQuickSort
    public void threeWayQuickSort(Comparable[] a){
        StdRandom.shuffle(a);
        threeWayQuickSort(a,0, a.length - 1);

    }

    private void threeWayQuickSort(Comparable[] a, int lo, int hi){
        if(lo >= hi) return ;

        /**
         * lt: left bound where v = a[lt]
         * i: iterating index
         * gt: right bound where v = a[gt]
         */
        int lt = lo, i = lo + 1, gt = hi;

        Comparable v = a[lo];
        while(i <= gt){
            int cmp = a[i].compareTo(v);
            //a[i] < v; then we exchange lt and i, move the both lt and i to next, since lt will be the position for v;
            if(cmp < 0) exchange(a, lt++, i++);
            else if(cmp > 0) exchange(a, gt--, i); //a[i] > v, move the a[i] value to the a[gt], and then gt--, then next round compare the i again
            else i++; //if a[i] == v, then check next element.
        }

        threeWayQuickSort(a, lo, lt - 1);
        threeWayQuickSort(a, gt + 1, hi);
    }
}
