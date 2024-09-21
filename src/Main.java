public class Main {
    public static void main(String[] args) {
        LoggerInterface logger = new ConsoleLogger();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(logger);

        Number a = view.getNumber();
        Number b = view.getNumber();
        int choice = view.getOperationChoice();

        Number result = null;
        switch (choice) {
            case 1:
                result = controller.add(a, b);
                break;
            case 2:
                result = controller.multiply(a, b);
                break;
            case 3:
                result = controller.divide(a, b);
                break;
            default:
                logger.error("Неверный выбор");
                System.out.println("Неверный выбор");
        }

        if (result != null) {
            view.displayResult(result);
        }
    }
}
