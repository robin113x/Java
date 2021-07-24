package Searching;

public class CountOcc {
    static int countOcc(int []arr,int n,int x){
        int first = firstOcc(arr,n,x);
        System.out.println(first);
        if (first==-1)
            return 0;
        else
            return lastOcc(arr,n,x)-first+1;
    }
    static int firstOcc(int []arr,int n,int x){
        int low =0;
        int high = n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]>x)
                high = mid-1;
            else if(arr[mid]<x)
                low = mid+1;
            else {
                if (mid==0||arr[mid]!=arr[mid-1])
                    return mid;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
    static int lastOcc(int[]arr,int n,int x){
        int low =0;
        int high = n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]>x)
                high = mid-1;
            else if(arr[mid]<x)
                low = mid+1;
            else {
                if (mid==n-1|| arr[mid]!=arr[mid+1])
                    return mid;
                else
                    low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]a={5,5,6,10,10,10,10,10,10,20,20};
        System.out.println(countOcc(a,a.length,10));
    }
}
