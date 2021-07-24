package Sorting;

import java.util.Arrays;

public class SortAndMerge {
    static void sortMerge(int arr[], int low, int mid, int high){
        int n = mid-low+1;
        int m = high-mid;
        int []first = new int[n];
        int []sec = new int[m];
        for (int i=0;i<n;i++){
            first[i] = arr[i+low];
        }
        for (int j = 0;j<m;j++){
            sec[j] = arr[n+j];
        }
        //----------------------------------------------------------------

        int i=0,j=0,k=0;
        while (i<n && j<m){
            if (first[i]<=sec[j]){
                arr[k] = first[i];
                i++;
                k++;
            }
            else {
                arr[k] = sec[j];
                k++;
                j++;
            }
        }
        while (i<n){
            arr[k] = first[i];
            k++;
            i++;
        }
        while (j<m){
            arr[k] = sec[j];
            j++;
            k++;
        }


    }
    public static void main(String[] args) {
        int[]arr = {10,15,20,11,30};
        System.out.println(Arrays.toString(arr));
        sortMerge(arr,0,2,4);
        System.out.println(Arrays.toString(arr));

    }
}
