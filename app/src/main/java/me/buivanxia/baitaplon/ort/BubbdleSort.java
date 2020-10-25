package me.buivanxia.baitaplon.ort;

import me.buivanxia.baitaplon.Sort;

public class BubbdleSort implements Sort {
    @Override
    public void sort(int[] arr, int length) {
        int t = 0;
        for  ( int  i =  0 ; i < length -  1 ; i ++) {
            for  ( int  j =  0 ; j < length -  1  - i; j ++) {
                if  (arr [j]> arr [j +  1 ])
                {
                    t = arr [j];
                    arr[j] = arr [j +  1 ];
                    arr[j +  1 ] = t;
                }
            }
        }
    }
}
