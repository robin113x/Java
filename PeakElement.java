package Searching;

public class PeakElement {
    static int peak(int[]a){
        int n =a.length;
        if (n==1)
            return n;
        if (a[0]>=a[1])
            return a[0];
        if (a[n-1]>=a[n-2])
            return a[n-1];
        for (int i=1;i<n-1;i++){
            if (a[i]>=a[i-1]&&a[i]>=a[i+1])
                return a[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]a = {30,5,10,20,15,7};
        System.out.println(peak(a));

    }
}
