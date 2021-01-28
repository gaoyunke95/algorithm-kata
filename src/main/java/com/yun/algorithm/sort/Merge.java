package com.yun.algorithm.sort;

/**
 * @author Henry Gao
 * @date 2021-01-26 - 18:19
 */
public class Merge extends DefaultSortAlgTemplate {

    private Comparable[] aux;

    @Override
    public void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);

    }

    public void bottomUpSort(Comparable[] a){
        int n = a.length;
        aux = new Comparable[n];
        for(int len = 1; len < n; len *= 2){
            for(int lo = 0; lo < n - len; lo += len+len){
                merge(a, lo, lo + len - 1, Math.min(lo+len+len - 1, n - 1));
            }
        }
    }

    //div and conquer
    private void sort(Comparable[] a, int lo, int hi){
        if(lo >= hi) return ;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }


    private void merge(Comparable[] a, int lo, int mid, int hi){
        //use for the first half of the array
        int i = lo;
        //use for the second half of the array
        int j = mid + 1;

        //copy the array to aux;
        for(int k = lo; k <= hi;k++){
            aux[k] = a[k];
        }

        for(int k = lo; k <= hi; k++){
            if(i > mid) a[k] = aux[j++];
            else if(j > hi) a[k] = aux[i++];
            else if(less(aux[j],aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }

    }
}
