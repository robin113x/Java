package ArrayGfG;
//Remove Duplicate element in sorted Arrays
import java.util.Arrays;

class RemoveDuplicate{
    static int remDup(int[]arr, int n){
        int []temp = new int[n];
        temp[0] = arr[0];
        int res =1;
        for (int i=1;i<n;i++){
            if (arr[i] != temp[res-1]){
                temp[res] = arr[i];
                res++;
            }
        }
        for (int i=0;i<res;i++){
            arr[i] = temp[i];
        }
        return res;
    }
    //More efficient way     Time complexity O(n)_________Space Complexity O(1)
    static int remveElel(int[]a){
        int res=1;
        int n = a.length;
        for (int i=1;i<n;i++){
            if (a[i]!=a[res-1]){
                a[res]=a[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[]a= {1,1};
        int l = a.length;
        System.out.println(Arrays.toString(a));
        int n = remDup(a,l);
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" \n more Efficient ");
        //more Efficient
        int n1 = remveElel(a);
        for (int i=0;i<n1;i++){
            System.out.print(a[i]+" ");
        }

    }
}