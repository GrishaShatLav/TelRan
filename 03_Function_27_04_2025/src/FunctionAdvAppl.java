public class FunctionAdvAppl {
    public static void main(String[] args) {
    double resMax;
    double resMin;
    double resAbs;
        //System.out.println(res);



        resMax = max(50,6);
        resAbs = abs(-150); //hw
        resMin =  min(3,6);  //hw

        System.out.println("Max = " + resMax);
        System.out.println("Abs = " + resAbs);
        System.out.println("Min = " + resMin);
    }

    private static double abs(int i) {

        return i>0?i:i*-1;
    }

    public static double min(int x, int y){
        return  x<y ?x:y;

    }

    public static double max(int x, int y){
        return  x>y ?x:y;

    }


}
