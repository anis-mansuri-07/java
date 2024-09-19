import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int n = sc.nextInt();
        Number num = new Number(n);
        System.out.println("Is "+n+" Zero? "+num.isZero()); 
        System.out.println("Is "+n+" Positive number? "+num.isPositive()); 
        System.out.println("Is "+n+" Negative number? "+num.isNegative()); 
        System.out.println("Is "+n+" Odd number? "+num.isOdd());  
        System.out.println("Is "+n+" Even number? "+num.isEven());  
        System.out.println("Factorial of "+n+" is "+num.getFactorial());  
    }
}
