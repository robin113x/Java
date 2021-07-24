package ArrayGfG;

import java.util.Arrays;

public class ReverseArr {
    static void Reverse(int []arr){
        int high = arr.length - 1;
        int low = 0;
        int temp;
        while ( low< high){
           temp = arr[low];
           arr[low] = arr[high];
           arr[high] = temp;
           low++;
           high--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,6,9,8,7};
        System.out.println(Arrays.toString(a));
        Reverse(a);
    }

}
