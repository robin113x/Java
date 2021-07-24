package ArrayGfG;

public class MaxNo {
    static int MaxInArray(int []a){
        int n = a.length;
        int max =0;

        for (int i=0;i<n;i++){
            if (a[i]>a[max]){
                max=i;
            }
        }
        return max;
    }

    public static void main(String []args){
        int[] arr={10,10,10,10};
        int idx =MaxInArray(arr);
        System.out.println(" Index No  :"+idx);


    }
}
