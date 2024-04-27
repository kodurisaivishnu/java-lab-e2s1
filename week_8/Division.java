// Division.java
package calculator;

public class Division {
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN; // Not a Number
        }
    }
}
