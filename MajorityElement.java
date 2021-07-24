package Searching;

public class MajorityElement {
    static int findMajority(int[]arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            int count = 1;
            for (int j =i+1; j<n;j++){       //Time complexity (O(n^2))
                if (arr[i]==arr[j])
                    count++;
            }
            if (count> n/2)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int []a= { 8,3,4,8,8,9,10};
        System.out.println(findMajority(a));
    }
}
