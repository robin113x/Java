package Sorting;

import java.util.Arrays;

public class MergeSort {
    static void Sort1(int []arr, int low, int high)
    {

        if (low<high){
            int m = low+(high-low)/2;
            Sort1(arr, low, m);
            Sort1(arr,m+1, high);
            Merge1(arr,low,m,high);
        }
    }
    static void Merge1(int[]arr, int low,int mid, int high){
        int n1 =  mid-low +1;
        int m = high-mid;
        int []first = new int[n1];
        int []sec = new int[m];
        for (int i = 0; i < n1; i++) {
            first[i] = arr[i];
        }
        for (int j = 0 ;j<m;j++){
            sec[j] = arr[n1+j];
        }
        int i=0,j=0,k=0;
        while (i<n1 && j<m){
            if (first[i]<=sec[j]){
                arr[k] = first[i];
                i++;
            }
            else {
                arr[k] = sec[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k] = first[i];
            k++;
            i++;
        }
        while (j<m){
            arr[k] = sec[j];
            k++;
            j++;
        }
    }
    public static void main(String[] args) {
        int[]array1 = { 12, 11, 13, 5, 6, 7 };
        System.out.println(Arrays.toString(array1));
        Sort1(array1,0,array1.length-1);
        System.out.println(Arrays.toString(array1));
    }
}
