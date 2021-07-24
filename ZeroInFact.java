public class ZeroInFact {

    static double countZeroFact(int n){
        int fact=1;
        int c =0;
        for (int i=2;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        while (fact%10==0){
            c++;
            fact=fact/10;

        }
        return c;
    }


    static int MoreEffective(int n){
        int c=0;
        for (int i=5;i<=n;i=i*5){
            c=c+n/i;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(countZeroFact(14));
        System.out.println(" ");
        System.out.println(MoreEffective(17));

    }
}
