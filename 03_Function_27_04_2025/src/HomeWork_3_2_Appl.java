import java.util.Scanner;

public class HomeWork_3_2_Appl {
    //2. Запрашиваем три числа и выводим либо фразу "Сумма трёх чисел положительная и чётная, либо просто сумму трёх чисел
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Please, enter the first Number:");
            Double s = scanner.nextDouble();
            System.out.println("Please, enter the second Number:");
            Double d = scanner.nextDouble();
            System.out.println("Please, enter the third Number:");
            Double e = scanner.nextDouble();
            double x = s+d+e;
            if (x>0&&x%2==0)
                System.out.println("Сумма трёх чисел положительная и чётная" );
            else
                System.out.println(x);

        } catch (Exception e){
            System.out.println("One of the entered values is not a number " + e);
        }




    }
}
