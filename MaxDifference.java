package ArrayGfG;

public class MaxDifference {
    public static void maxDifference(int []arr){
        int n = arr.length;
        int maxD = arr[1] - arr[0];
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                maxD = Math.max(maxD, arr[j]-arr[i] );
            }
        }
        System.out.println(" "+maxD);
    }
    public static void main(String[] args) {
    int []a = {2,3,10,6,4,8,1};
    maxDifference(a);
    int a1[]= {30,10,8,2};
    maxDifference(a1);
    }
}
