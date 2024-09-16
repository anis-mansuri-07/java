
public class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public boolean isZero() {
        return value == 0;
    }

    public boolean isPositive() {
        return value > 0;
    }

    public boolean isNegative() {
        return value < 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public double getFactorial() {
        if (value < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        } else if (value == 0 || value == 1) {
            return 1;
        } else {
            double factorial = 1;
            for (int i = 2; i <= (int) value; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        Number num = new Number(5);
        System.out.println(num.isZero());  // false
        System.out.println(num.isPositive());  // true
        System.out.println(num.isNegative());  // false
        System.out.println(num.isOdd());  // true
        System.out.println(num.isEven());  // false
        System.out.println(num.getFactorial());  // 120.0
    }
}
