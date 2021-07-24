package Searching;

import java.util.Arrays;

public class Median {
    static void medianofArr(int[]a,int[]b){
        int n = a.length;
        int m = b.length;

        int []temp = new int[n+m];
        for (int i =0;i<n;i++){
            temp[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            temp[n+i] = b[i];
        }
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        int low =0;
        int high = m+n-1;

        if ((n+m)%2==0){
            int mid = (low+high)/2;
            float avg = (float) (temp[mid]+temp[mid-1])/2;
            System.out.println(avg);
        }
        else {
            int mid = (low+high)/2;
            System.out.println(temp[mid]);
        }


    }
    public static void main(String[] args) {
        int[]a = {10,20,30,40,50};
        int[]b = {5,15,25,35,45};
        medianofArr(a,b);
    }
}
