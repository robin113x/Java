package ArrayGfG;

public class Kadanes {
    static int kadanes(int []a){
        int max =0, sum =0;
        int n = a.length;
        for (int i=0;i<n;i++){
            sum = sum + a[i];
            if (sum >max){
                max = sum;
            }
            if (sum < 0){
                sum=0;
            }

        }
        return max;
    }
   static int maxSubarraySum(int arr[], int n){

        int cur_sum = arr[0];
        int max = arr[0];

        for(int i = 1; i<n;i++){

            cur_sum = Math.max(arr[i],cur_sum+arr[i]);
            max = Math.max(cur_sum,max);

        }
        return max;

    }

    public static void main(String[] args) {
        int[]a= {1,2,3,-2,5};
        System.out.println(kadanes(a));
        int len = a.length;

        System.out.println(maxSubarraySum(a,len));

    }
}
