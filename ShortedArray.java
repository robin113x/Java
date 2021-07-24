package ArrayGfG;

public class ShortedArray {
    static boolean isSorted(int[] arr){
        /*
        Time Complexity O(n^2)
         */
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>arr[j])
                    return false;
            }
        }
        return true;
    }
    /*
     Time Complexity O(n)
     more efficient way
    */

    static boolean isSorted1(int[]arr){
        int n = arr.length;
        for (int i=1;i<n;i++){
            if (arr[i]<arr[i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[]a = {1,2,3,5,4,6,9};
        System.out.println(isSorted(a));
        System.out.println(isSorted1(a));

    }
}
