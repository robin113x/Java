package ArrayGfG;

public class MaxConsecutiveOnes {
    static int maxOnes(int[] a){
        int n = a.length;
        int res = 0;

        for (int i=0;i<n;i++){
            int curr= 0;
            for (int j=i;j<n;j++){
                if (a[j]==1){
                    curr++;
                }
                else{

                    break;
                }
            }
            res=Math.max(curr,res);
        }
        return res;
    }

    //More efficient way
    static int MoreOne(int[]a){
        int n = a.length;
        int c =0;
        int res=0;
        for (int i=0;i<n;i++){
            if (a[i]==0){
                c=0;
            }
            else {
                c++;
                res=Math.max(res,c);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] a={1,0,0,1,1,1,1,1,1,0,0,1,0,1};
        System.out.println(maxOnes(a)) ;
        System.out.println(MoreOne(a));


    }
}
