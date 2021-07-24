package ArrayGfG;

import java.util.Arrays;

public class lRotate {
    static void lRotate1(int[]arr){
        int n = arr.length;
        int temp = arr[0];
        for (int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        lRotate1(a);
    }
}
