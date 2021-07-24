package ArrayGfG;

public class SecondLarge {
    static int secLarge(int []arr,int n){
        int large = Larges(arr,n);
        int result =-1;
        for (int i=0;i<n;i++){
            if (arr[i]!=arr[large]){
                if (result==-1){
                    result=i;
                }
                else if (arr[i]>arr[result]){
                    result=i;
                }

            }
        }
        return result;
    }

    static int Larges(int []a,int n){
        int max=0;
        for(int i=0;i<n;i++){
            if (a[i]>a[max])
                max=i;
        }
        return max;
    }


    //More efficient way
    static int SecondLargest(int []a){
        int n=a.length;
        int max =0;
        int res =-1;
        for (int i=1;i<n;i++){
            if (a[i]>a[max]){
                res = max;
                max =i;
            }
            else if (a[i]!=a[max] ){
                if (res==-1 || a[i] > a[res]){
                    res = i;
                }
            }
        }
        return res;
    }


    public static void main(String []args){
        int []arr={10,0,9,8,9};
        int n=arr.length;
        int idx = secLarge(arr,n);
        System.out.println(idx);
        //System.out.println(arr[idx]);

        System.out.println(SecondLargest(arr));

    }
}





















