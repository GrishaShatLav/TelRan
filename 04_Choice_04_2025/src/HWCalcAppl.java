import java.util.Scanner;


//+ - * / % ^

public class HWCalcAppl {
    public static void main(String[] args) {
        int s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first number?");
        double n = scanner.nextDouble();


        System.out.println("Please, enter second number?");
        double m = scanner.nextDouble();
        while (true) {
            System.out.println("Please, Choose one of the available operations?\n1: +\n2: -\n3: *\n4: /\n5: %\n6: ^");
            s = scanner.nextInt();
            if (s >= 1 && s <= 6) {
                break;
            } else
                System.out.println("Please, choose one of the available operations");
        }
        double r = calculator(n, m, s);
        System.out.println("The result:" + r);

    }

    public static double calculator(double n, double m, int s) {
        return switch (s) {
            case 1 -> n + m;
            case 2 -> n - m;
            case 3 -> n * m;
            case 4 -> n / m;
            case 5 -> n % m;
            case 6 -> Math.pow(n, m);
            default -> {
                System.out.println("Error 1: Wrong operation");
                yield 0. / 0.;
            }


        };
    }
}
