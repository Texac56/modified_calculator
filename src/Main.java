import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num1 = scanner.nextInt();

        int res;

        System.out.print("Действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();
        switch (action) {
            case "+":
                res = num + num1;
                System.out.println("Результат: " + res );
                break;
            case "-":
                res = num - num1;
                System.out.println("Результат: " + res );
                break;
            case "/":
                if(num1 == 0) {
                    System.out.println("На ноль делить нельзя");
                }
                else {
                    res = num / num1;
                    System.out.println("Результат: " + res);
                }
                break;
            case "*":
                res = num * num1;
                System.out.println("Результат:" + res );
                break;
            default:
                System.out.println("Что-то не так");
        }

        }
    }
