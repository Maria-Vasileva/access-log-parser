import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число и нажмите <Enter>: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе целое число и нажмите <Enter>: ");
        int number2 = new Scanner(System.in).nextInt();
        System.out.println("Сумма чисел: "+ (number1+number2));
        System.out.println("Разность чисел: "+ (number1-number2));
        System.out.println("Произведение чисел: "+ (number1*number2));
        System.out.println("Частное чисел: "+ ((double)number1/(double)number2));
    }
}
