
public class TrailingZero {
    public static long trailingzero(long n){
        long fact=1;
        long count =0;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        while (fact%10==0){
            count++;
            fact=fact/10;
        }
        return count;
    }

    // Efficient way to find zero
    public static int Bestway(int n){
        int count=0;
        for(int i=5;i<=n;i=i*5){
            count=count+n/i;
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println(trailingzero(20));
        System.out.println(Bestway(24));
    }
}
