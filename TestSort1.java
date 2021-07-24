package Sorting;
import java.util.Arrays;
public class TestSort1 {
    static void sort1(int[]arr, int low , int high){
        if(low<high){
            int m2 = low+(high-low)/2;
            sort1(arr,low,m2);
            sort1(arr,m2+1,high);
            merge1(arr,low,m2,high);
        }
    }
    static void merge1(int[]a,int low,int mi, int high)
    {
        int n = mi-low+1;
        int m1 = high - mi;
        int[] first =new int[n];
        int[] sec = new int[m1];
        for(int i =0;i<n;i++){
            first[i] = a[i];
        }
        for(int j=0;j<m1;j++){
            sec[j] = a[n+j];
        }
        int i=0,j=0,k=0;
        while(i<n && j<m1){
            if(first[i]<=sec[j]){
                a[k]=first[i];
                i++;
                k++;
            }
            else{
                a[k]=sec[j];
                j++;
                k++;
            }
        }
        while(i<n){
            a[k]=first[i];
            i++;
            k++;
        }
        while(j<m1){
            a[k]=sec[j];
            k++;
            j++;
        }
    }
    public static void main(String args[]) {
        int[]arr1 = {10, 80, 30, 90, 40, 1,50,3,85, 70};
        System.out.println(Arrays.toString(arr1));
        sort1(arr1,0,arr1.length-1);
        System.out.println(Arrays.toString(arr1));

    }
}