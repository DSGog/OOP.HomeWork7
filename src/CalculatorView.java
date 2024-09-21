import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner = new Scanner(System.in);

    public Number getNumber() {
        System.out.println("Введите число: ");
        double value = scanner.nextDouble();
        return new Number(value);
    }

    public void displayResult(Number result) {
        if (result != null) {
            System.out.println("Результат: " + result);
        }
    }

    public int getOperationChoice() {
        System.out.println("Выберите: 1-Сложение, 2-Умножение, 3-Деление");
        return scanner.nextInt();
    }
}
