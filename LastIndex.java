package Searching;

public class LastIndex {
    static int lastIndex(int[]arr, int x){
        int n = arr.length;
        for (int i = n-1; i>=0;i--){
            if (arr[i]==x)
                return i;
        }
        return -1;
    }
    static int lastIndex1(int []a,int low,int high,int n,int x){
        if (low>high)
            return -1;
        int mid = (low+high)/2;
        if (a[mid]>x)
            return lastIndex1(a,low,mid-1,n,x);
        else if (a[mid]<x)
            return lastIndex1(a,mid+1,high,n,x);
        else {
            if (mid == n-1 || a[mid]!=a[mid+1])
                return mid;
            else
                return lastIndex1(a,mid+1,high,n,x);
        }
    }
    static int lastIndex2(int[]a,int n,int x){
        int low=0,high=n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (a[mid]>x){
                high=mid-1;
            }
            else if (a[mid]<x){
                low=mid+1;
            }
            else {
                if (mid==n-1||a[mid]!=a[mid+1])
                    return mid;
                else
                    low = mid+1;
            }
        }
        return -1;  //404 not found
    }
    public static void main(String[] args) {
        int[]a = {10,12,15,20,20,20,20,30,40,50,60,70};
        int idx = lastIndex(a,2);
        System.out.println("Last index of : "+idx);
        System.out.println(lastIndex1(a,0,11,12,2));
        System.out.println(lastIndex2(a,12,2));
    }
}
