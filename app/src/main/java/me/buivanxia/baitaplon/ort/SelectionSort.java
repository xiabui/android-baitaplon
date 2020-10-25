package me.buivanxia.baitaplon.ort;

import me.buivanxia.baitaplon.Sort;

public class SelectionSort implements Sort {
    @Override
    public void sort(int[] arr, int length)
    {
            // duyệt qua từng phần tử
            for (int i = 0; i < length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < length; j++) {
                    if (arr[j] < arr[index]) {
                        index = j;
                    }
                }
                //hoán đổi
                if (index != i) {
                    int temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                }
            }
    }
}
