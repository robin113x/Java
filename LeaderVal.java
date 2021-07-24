package ArrayGfG;

public class LeaderVal {
    public static void leader(int []arr){  //Time Complexity O(n^2)
        int n =arr.length;
        for (int i=0;i<n;i++){
            boolean flag = false;
            for (int j=i;j<n;j++){
                if (arr[i] < arr[j]){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {7,10,4,6,5,3,2};
        leader(a);

    }
}
