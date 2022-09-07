package com.wan.algorithm.sort;

/**
 * @author wan
 * @Description: 快速排序
 * @date 2021/11/18 15:52
 */
public class QuickSortSolution {
    public static void  quickSort(int[] array, int start, int end) {
        if(start<end) {
            int i = start;
            int j = end;
            int item = array[i];
            while(i<j) {
                while(array[j]>item & i<j) {
                    j--;
                }
                    if(i<j) {
                    array[i] = array[j];
                    i++;
                }
                while(array[i]<item & i<j) {
                    i++;
                }
                if(i<j) {
                    array[j] = array[i];
                    j--;
                }
            }
            array[i] = item;
            quickSort(array, start , i-1);
            quickSort(array, i+1, end);
        }

    }

    public static void main(String[] args) {
        int[] array = {6,8,3,4,5,6,9,2,1};
        quickSort(array, 0, 8);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
