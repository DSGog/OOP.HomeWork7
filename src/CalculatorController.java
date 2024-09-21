public class CalculatorController {
    private final LoggerInterface logger;

    public CalculatorController(LoggerInterface logger) {
        this.logger = logger;
    }

    public Number add(Number a, Number b) {
        logger.info("Сложение: " + a + " + " + b);
        return a.add(b);
    }

    public Number multiply(Number a, Number b) {
        logger.info("Умножение: " + a + " * " + b);
        return a.multiply(b);
    }

    public Number divide(Number a, Number b) {
        logger.info("Деление: " + a + " / " + b);
        try {
            return a.divide(b);
        } catch (ArithmeticException e) {
            logger.error("Ошибка: " + e.getMessage());
            return null;
        }
    }
}
