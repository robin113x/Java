package Sorting;
import java.util.Arrays;
public class Mege2Array {     //Time complexity O(n+m)*log(n+m)      Aux. Space O(n+m)
    static void mergeArray(int[]a, int[]b){
        int n = a.length, m = b.length;
        int []c = new int[m+n];
        for (int i=0;i<n;i++){
            c[i] = a[i];
        }
        for (int j=0 ;j<m;j++){
            c[n+j] = b[j];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }

    //effective solution
    static void MergeArray(int []a,int []b){    //Time complexity O(n+m) Aux. Space O(1)
        int n = a.length, m  =b.length;
        int i=0,j=0;
        while (i<n && j<m){
            if (a[i]<=b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else {
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while (i<n){
            System.out.print(a[i]+" ");
            i++;
        }
        while (j<m){
            System.out.print(b[j]+" ");
            j++;
        }
    }

    public static void main(String[] args) {
        int[]arr1={1,2,5,8,9,11,15};
        int[]arr2={3,4,6,10,11,16,17,18};
        mergeArray(arr1,arr2);
        MergeArray(arr1,arr2);
    }
}
