package com.yun.algorithm.sort;

/**
 * @author Henry Gao
 * @date 2021-01-18 - 09:44
 */
public class DefaultSortAlgTemplate implements SortAlgTemplate {


    /**
     * actual implementation of the sorting algorithm
     * @param arr an unsorted array
     */
    @Override
    public void sort(Comparable[] arr) {
        //sorting algorithm
        throw new UnsupportedOperationException("please provide a actual sort algorithm");

    }

    /**
     * compare two variables
     * @param var1
     * @param var2
     * @return if var1 smaller than var2 return true; else return false;
     */
    @Override
    public boolean less(Comparable var1, Comparable var2){
        return var1.compareTo(var2) < 0;
    }

    /**
     * exchange two nums in an array with given index
     * @param arr
     * @param i
     * @param j
     */
    @Override
    public void exchange(Comparable[] arr, int i , int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * checking an array is sorted or not
     * @param arr
     * @return true if sorted; false if not sorted
     */
    @Override
    public boolean isSorted(Comparable[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            if(less(arr[i], arr[i-1])) return false;
        }
        return true;
    }

    /**
     * print a given array
     * @param arr
     */
    @Override
    public void show(Comparable[] arr){
        for(Comparable value: arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * take in an arr, process sort, validate sort and print
     * @param args
     */
    public void process(Comparable[] args){
        sort(args);
        assert isSorted(args);
        show(args);
    }

}
