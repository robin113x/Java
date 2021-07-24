package ArrayGfG;

public class MaxSum {

    static int maxSum1(int []arr){
        int n =arr.length;
        int max =arr[0];
        for (int i=0;i<n;i++){
            int sum=0;
            for (int j=i;j<n;j++){
                sum = sum+arr[i];
                max= Math.max(sum,max);
            }
        }
        return max;
    }
    static int maxSum(int []arr){
        int n = arr.length;
        int max = arr[0];
        int sum =arr[0];
        for (int i=1;i<n;i++){
            sum = Math.max(sum+arr[i],arr[i]);
            max = Math.max(sum,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[]a ={-6,-8,-1};
        System.out.println("Time complexity O(n)");
        System.out.println("  "+maxSum(a));
        System.out.println("Time complexity O(n^2)");
        System.out.println("  "+maxSum1(a));
    }
}
