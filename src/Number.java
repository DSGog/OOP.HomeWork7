public class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public Number add(Number other) {
        return new Number(this.value + other.getValue());
    }

    public Number multiply(Number other) {
        return new Number(this.value * other.getValue());
    }

    public Number divide(Number other) {
        if (other.getValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return new Number(this.value / other.getValue());
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
