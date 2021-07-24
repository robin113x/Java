package Searching;

public class SqrRoot {
    static int sqRoot(int x){
        int i=1;
        while (i*i<=x){
            i++;
            System.out.println(i);
        }
        return (i-1);
    }

    static int sqROOT(int x){
        int low =1;
        int high =x;
        int ans =-1;
        while (low<=high){
            int mid = (low+high)/2;
            int sqr = mid*mid;
            if (sqr==x)
                return mid;
            else if (sqr>x)
                high = mid-1;
            else
                low = mid+1;
                ans = mid;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(" Ans "+sqRoot(16));
        System.out.println("           ");
        System.out.println(sqROOT(39));
    }
}
