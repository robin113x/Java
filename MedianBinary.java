package Searching;

public class MedianBinary {
    static double getmed(int[]a, int[]b){
        int n = a.length;
        int m = b.length;
        int low = 0, high = n;
        while (low<=high){
            int mid1 = (high+low)/2;
            int mid2 = (n+m+1)/2-mid1;
            int min1 = (mid1==n)? Integer.MIN_VALUE:a[mid1];
            int max1 = (mid1==0)? Integer.MAX_VALUE:a[mid1-1];

            int min2 = (mid2==n)?Integer.MIN_VALUE:b[mid2];
            int max2 = (mid2==0)?Integer.MAX_VALUE:b[mid2-1];

            if (max1<=min2 && max2<=min1){
                if ((n+m)%2==0)
                    return ((double) Math.max(max1,max2) + Math.min(min1,min2))/2;
                else
                    return ((double) Math.max(max1,max2));
            }
            else if(max1>min2)
                high = mid1-1;
            else
                low = low+1;
        }
            return 0;
    }
    public static void main(String[] args) {
        int[]a = {10,20,30,40,50};
        int[]b = {5,15,25,35,45,55,56,75,85};
        System.out.println(getmed(a,b));
    }
}
