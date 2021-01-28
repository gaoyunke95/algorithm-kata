package com.yun.algorithm.sort;

/**
 * @author Henry Gao
 * @date 2021-01-18 - 16:28
 */
public class Shell extends DefaultSortAlgTemplate{

    @Override
    public void sort(Comparable[] arr) {
        int n = arr.length;

        int k = 1;

        while(k < n/3) k = k*3 + 1;

        while(k >= 1){
            for(int i= k ; i < n; i++){
                //j = i ;j>=k
                for(int j = i; j >= k && less(arr[j], arr[j - k]); j -=k){
                    exchange(arr, j, j-k);
                }
            }
            k = k/3;
        }

    }
}
