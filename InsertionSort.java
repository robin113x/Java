package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insertion(int[]arr){
        int n = arr.length;
        int i,j,key;
        for(i=1;i<n;i++){
            key = arr[i];
            j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[]a = {10,50,30,20,22};
        System.out.println(Arrays.toString(a));

        insertion(a);
    }

}
