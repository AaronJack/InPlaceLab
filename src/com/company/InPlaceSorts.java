package com.company;

public class InPlaceSorts {
    public static void InsertionSort(int[] list1){
        for(int i = 0; i < list1.length; i++){
            for(int j = i; j > 0; j--){
                if(list1[j-1] > list1[j]){
                    list1[j-1] = list1[j];
                    list1[j] = list1[j-1];
                }
                else {
                    j = 0;
                }
            }
        }
    }
}
