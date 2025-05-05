import java.util.Scanner;
public class HomeWork_3_1_Appl {
    //1. Запрашиваем число и выводим информацию о том, делится ли оно на три

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a Number:");
        try {
            Double s = scanner.nextDouble();
            if (s%3==0)
            System.out.println("Ваше число делится на 3" );
            else
                System.out.println("Ваше число НЕ делится на 3");

        } catch (Exception e){
            System.out.println("Entered value is not a number " + e);
        }




    }

}
