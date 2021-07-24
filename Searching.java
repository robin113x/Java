package ArrayGfG;

public class Searching {
    static int Search(int[] arr, int no, int len){
        for (int i=0;i<len;i++){
            if (no==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,5,9,7,8,25,63,74};
        int len = a.length;
        System.out.println(" Index No :  "+Search(a,1,len));

    }
}
