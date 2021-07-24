public class TempConv {
    static int Change(int temp){
        //code
        int f = ((temp*9)/5)+32;
        return f;
    }


    public static void main(String[] args) {
        System.out.println(Change(4));
    }
}
