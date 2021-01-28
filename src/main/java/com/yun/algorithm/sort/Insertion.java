package com.yun.algorithm.sort;

/**
 * @author Henry Gao
 * @date 2021-01-18 - 16:18
 */
public class Insertion extends DefaultSortAlgTemplate{


    @Override
    public void sort(Comparable[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++){
            //j, j - 1
            for(int j = i; j > 0 && less(arr[j], arr[j - 1]); j--){
                exchange(arr, j, j - 1);
            }
        }

    }
}
