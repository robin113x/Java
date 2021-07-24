package ArrayGfG;

public class TappingRainWater {
    public static void TappingRain(int []arr){
        int n = arr.length;
        int res = 0;
        for (int i=1;i<n-1;i++){
            int lmax = arr[i];
            for (int j=0;j<i-1;j++){
                lmax = Math.max(lmax,arr[j]);
            }
            int rmax = arr[i];
            for (int j=i+1;j<n;j++){
                rmax = Math.max(rmax,arr[j]);
            }
            res = res+Math.min(lmax,rmax)-arr[i];
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int[]a={3,0,1,2,5};
        TappingRain(a);

    }
}
