package com.yun.algorithm.sort;

import org.junit.Test;

/**
 * @author Henry Gao
 * @date 2021-01-18 - 09:44
 */
public class Selection extends DefaultSortAlgTemplate {

    @Override
    public void sort(Comparable[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(less(arr[j], arr[i])) exchange(arr, i, j);
            }
        }
    }


}
