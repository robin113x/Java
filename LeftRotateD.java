package ArrayGfG;

import java.util.Arrays;

public class LeftRotateD {
    public static void LeftRotateOne(int []arr){
        int len = arr.length;
        int temp = arr[0];
        for (int i=1;i<len;i++){
            arr[i-1] = arr[i];
        }
        arr[len-1] = temp;
        System.out.println(Arrays.toString(arr));

    }
    public static void LeftRotatebyD(int []arr,int d){
        for (int i=0;i<d;i++){
            LeftRotateOne(arr);
        }
    }
    //Better Method Time complexity O(n) -- Space Complexity O(d)
    public static void LeftRotate(int []arr,int d){
        int []temp = new int[d];
        int n = arr.length;
        for (int i=0;i<d;i++){
            temp[i] = arr[i];
        }

        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }
        for (int i=0;i<d;i++){
            arr[n-d+i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void lRotate(int []arr,int d){
        int n = arr.length;
        ReverseArr(arr,0,d-1);
        ReverseArr(arr,d,n-1);
        ReverseArr(arr,0,n-1);

    }
    static void ReverseArr(int []arr,int low,int high){
        while (high>low){
            int temp =arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,8,9};
        System.out.println(Arrays.toString(arr));
        LeftRotatebyD(arr,2);
       System.out.println("\n More Effective Method");
       LeftRotate(arr,2);
       System.out.println("\n\n Best Method ");
        lRotate(arr,2);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
