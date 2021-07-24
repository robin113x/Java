package Searching;

import java.util.Arrays;

public class PairSum {
    //naive sol Time complexity(O(n^2))
    static boolean sumofPair(int[]a,int x){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for(int j=i+1; j<n;j++){
                if (a[i]+a[j]==x){
                    System.out.println(a[i]+" : "+a[j]);
                    return true;
                }
            }
        }
        return false;
    }
    //More effective sol
    static boolean sumOfPair(int[]a, int x){
        Arrays.sort(a);
        int n = a.length;
        int low=0;
        int high = n-1;
        while (low<high){
            if (a[low]+a[high]==x){
                System.out.println(a[low]+" : "+a[high]);
                return true;
            }
            if (a[low]+a[high]>x){
                high--;
            }
            else
                low++;
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr = {3,5,9,2,8,10,11};
        System.out.println(sumofPair(arr,17));
        System.out.println(sumOfPair(arr,17));
    }
}
