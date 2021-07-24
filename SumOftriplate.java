package Searching;

public class SumOftriplate {
    static boolean sumOFtri(int[]a, int x){
        int n = a.length;
        for (int i = 0; i < n; i++) {
                for (int j = i+1;j<n;j++){
                    for (int z = j+1; z <n; z++){
                        if (a[i]+a[j]+a[z] ==x){
                            System.out.println(a[i]+" "+a[j]+" "+a[z]);
                            return true;
                        }
                    }
                }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr = {2,3,4,8,9,20,40,50};
        boolean res = sumOFtri(arr,32);
        System.out.println(res);
    }
}
