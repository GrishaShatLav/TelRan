public class ForLoopAppl {
    public static void main(String[] args) {
       // Gagarin2();
       // stars(25,5);
        int res = pow2(2,3);
        System.out.println("pow "+res);
        int sum = sumDigits2(2109991);
        System.out.println("sum "+sum);
    }

    private static void stars(int n, int k) {
        for (int i = 1;i<=n; i++){
            if (i % k!=0){
                System.out.print("*");
            }
            else {
                System.out.println("*");
            }

        }
        System.out.println("finish");
    }

    private static void Gagarin2() {
        for(int i=10;i>0;i--) {
            System.out.println(i);
        }
        System.out.println("Go");
    }

    public static int pow2(int x, int n){
        int res=1;
        for ( ;n>0;n--) {
            res = res *x;
        }
        return res;
    }

    public static int sumDigits2 (int num){
        int res = 0;
        for (;num!=0;num=num/10){
            int digit = num%10;
            res = res +digit;
        }
        return res;
    }
}
