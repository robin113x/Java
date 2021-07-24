package ArrayGfG;

import java.util.Arrays;

public class SeparateZero {
    static void Separate(int[]a){
        int n = a.length;
        for (int i=0;i<n;i++){
            if (a[i]==0){
                for (int j = i+1;j<n;j++){
                    if (a[j]!=0){
                        swap(a[i],a[j]);
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    static void swap(int a , int b){
        int temp = a;
        a =b;
        b= temp;
    }
    public static void main(String[] args) {
        int[]a = {1,0,0,0,2,30,0,8,90,70,30};
        Separate(a);

    }
}
