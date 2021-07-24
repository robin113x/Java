package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selection(int[]arr){
        int n = arr.length;
        int temp,i,j,min;
        for (i=0;i<n-1;i++){
            min = i;
            for (j=i+1;j<n;j++){
                if (arr[j]<arr[min])
                    min=j;
            }
            //swap
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[]a = {10,5,8,20,2,18};
        System.out.println(Arrays.toString(a));
        selection(a);
    }
}
