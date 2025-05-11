public class Homework {
    public static void main(String[] args) {
        int res = countDigits(123);//3
        System.out.println(res);

        res = countDigits(8);//1
        System.out.println(res);

        res = countDigits(0);//1
        System.out.println(res);

        luckynumber(173854);//1+3+5 != 7+8+4
        luckynumber(135531);//1+3+5 != 7+8+4
        luckynumber(242424);//1+3+5 != 7+8+4
        luckynumber(2425424);//1+3+5 != 7+8+4
    }

    private static void luckynumber(int i) {

        //length check
        int lengthCheckValue = i;
        int digAmount = 0;
        if (lengthCheckValue == 0){
            digAmount =1;}
        else {
            for (; lengthCheckValue > 0; digAmount++) {
                lengthCheckValue = lengthCheckValue / 10;

            }

        }
        if (digAmount != 6){
        System.out.println("Wrong number length");
        return;}


        int sumEven=0;
        int sumUnEven=0;

        for (int n = 6;n!=0;n--){
            int num = i%10;
            if (n%2!=0){
                sumEven+=num;
            }
            else {
                sumUnEven+=num;
            }

            i = i/10;
        }
        if (sumEven == sumUnEven)
            System.out.println("This number is a lucky number");
        else
            System.out.println("This number is a UNlucky number");
    }

    private static int countDigits(int num) {

        int digAmount = 0;
        if (num == 0){
            digAmount =1; return digAmount;}
        else {
            for (; num > 0; digAmount++) {
                num = num / 10;

            }
            return digAmount;
        }
    }
}
