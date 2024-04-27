// MainCalculator.java
// import calculator.Addition;
// import calculator.Subtraction;
// import calculator.Multiplication;
// import calculator.Division;
package cal;
import calculator.*;
public class MainCalculator4 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Using classes from the "calculator" package
        int sum = Addition.add(num1, num2);
        int difference = Subtraction.subtract(num1, num2);
        int product = Multiplication.multiply(num1, num2);
        double quotient = Division.divide(num1, num2);

        // Displaying results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}

// i observe --ksv regards

/*
 This is used to run all java files in folder: (javac calculator/*.java MainCalculator.java)
 then run (java MainCalculator)
 */
