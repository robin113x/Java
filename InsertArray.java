package ArrayGfG;
import java.util.Arrays;

public class InsertArray {
    public static int inset(int[]arr, int n, int cap,int e,int pos){
        if (cap==n)
            return 0;
        int idx = pos-1;
        for (int i=n-1;i>=idx;i--){
            arr[i+1] = arr[i];
        }
        arr[idx]=e;
        return (n+1);
    }


    public static void main(String[]args){
        int []a = new int[10];
        a[0]=1;
        a[1]=12;
        a[2]=145;
        a[3]=152;
        a[4]=18;
       for (int i=0;i<5;i++)
       {
           System.out.print(a[i]+ " ");
       }
        System.out.println( " ");

       int n= inset(a,5,9,21,2);
        for (int i=0;i<=n;i++){
            System.out.print(a[i]+ " ");
        }

    }
}
