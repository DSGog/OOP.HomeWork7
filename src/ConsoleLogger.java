public class ConsoleLogger implements LoggerInterface {
    @Override
    public void info(String message) {
        System.out.println("[INFO]: " + message);
    }

    @Override
    public void error(String message) {
        System.err.println("[Ошибка]: " + message);
    }
}
