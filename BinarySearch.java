package Searching;

public class BinarySearch {
    static int bSearch(int[]arr, int x){
        int n = arr.length;
        int low =0, high=n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]a = {10,20,30,40,50,60,70,80,90};
        int res = bSearch(a,30);
        System.out.println(res);
    }
}
