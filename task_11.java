import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String inputNumber1 = scanner.next();

        System.out.print("Введите второе число: ");
        int inputNumber2 = scanner.nextInt();

        int number1 = Integer.parseInt(inputNumber1);

        int maxNumber = Math.max(number1, inputNumber2);

        System.out.println("Большее число: " + maxNumber);

        double minNumber = Math.min(number1, inputNumber2);

        System.out.println("Меньшее число: " + minNumber);
    }
}