package ArrayGfG;

public class TappingWater {
    static int rainWater(int[]a){
        int n = a.length;
        int []left = new int[n];
        int []right = new int[n];


        left[0] = a[0];
        for (int i = 1; i<n; i++){
            left[i] = Math.max(a[i],left[i-1]);
        }
        right[n-1] = a[n-1];
        for (int i = n-2;i>=0;i--){
            right[i] = Math.max(a[i],right[i+1]);
        }
        //Result
        int ans=0;
        for (int i=0;i<n;i++){
            ans = ans+Math.min(left[i],right[i])-a[i];
        }
        return ans;
    }
    public static void main (String args[]){
        int[]a={4,1,2,3,5,2,1,2,3};
        System.out.println(rainWater(a));

    }
}
