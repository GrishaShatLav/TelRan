import java.util.Objects;
import java.util.Scanner;

public class HomeWork_3_3_Appl {
    //(задание повышенной сложности, необязательное, только для желающих).
    // Напишите программу, которая определяет, может ли пользователь получить кредит на основе введенных данных.
    // Программа должна запрашивать у пользователя информацию о его доходе, возрасте и наличии задолженностей,
    // а затем использовать логические выражения для принятия решения.
    // Запросите у пользователя: Наличие задолженностей (да/нет).
    // Месячный доход (в у.е.).
    // Возраст (в годах).
    // Условия для получения кредита:
    // Пользователь должен быть старше 21 года.
    // Месячный доход должен быть не менее 12000.
    // Нельзя иметь задолженности (если "да", то кредит не выдается).
    // Используйте логические выражения для проверки условий.
    // Напишите логическое выражение, которое использует все эти данные и даёт результат true, если кредит выдаётся, false, если нет.
    // В зависимости от того, какой результат получился, выведите на экран "Кредит одобрен" или "Кредит не одобрен".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean freeOfDebt;
        boolean hasFunds;
        boolean oldEnough;

        try {
            //debt check
            while (true){
                System.out.println("Do you have Debt? y/n");
                String s = scanner.nextLine();
                if (Objects.equals(s, "y")) {
                    freeOfDebt = false;
                    break;
                }
                else if (Objects.equals(s, "n")) {
                    freeOfDebt = true;
                    break;
                }
                else {
                    System.out.println("Please, answer y or n");
                }

            }

            //salary check
            System.out.println("Please, enter your salary");
            double w = scanner.nextDouble();
            if (w>=12000)
                hasFunds = true;
            else
                hasFunds = false;

            //age check
            System.out.println("Please, enter your age");
            int a = scanner.nextInt();
            if (a<1){
                System.out.println("Please, enter a valid age");
                System. exit(0);
            }
            if(a>=21)
                oldEnough = true;
            else
                oldEnough = false;


            if (freeOfDebt&&hasFunds&&oldEnough)
                System.out.println("Кредит одобрен");
            else
                System.out.println("Кредит не одобрен");


        } catch (Exception e){
            System.out.println("Entered value is not a number " + e);
        }
    }

}
