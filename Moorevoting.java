package Searching;
public class Moorevoting {
    static int moore(int []arr){
        int count =1;
        int ans = 0;
        int n = arr.length;
        for (int i =1;i<n;i++){
            if (arr[i] == arr[ans]){
                    count++;
            }
            else {
                count--;
            }
            if (count==0){
                count=1;
                ans = i;
            }
        }
        return ans;
    }
    static boolean majority1(int[]a){
        int c = 0;
        int n = a.length;
        int answer = moore(a);
        for (int i = 0; i <n ; i++) {
            if (a[i]==a[answer]){
                c++;
            }
        }
        if (c > n/2){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int[]arr = {8,3,8,4,8,8,9,2,8};
        System.out.println(majority1(arr));

    }
}
