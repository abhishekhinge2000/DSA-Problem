package sprint4;

public class DigitSum {
    // Recursive function to compute sum of digits
    public static int sumOfDigits(int n) {
        // Base case: if n is a single digit, return n
        if (n < 10) {
            return n;
        }
        // Recursive case: last digit + sum of remaining digits
        return (n % 10) + sumOfDigits(n / 10);
    }
    // Main method to test the function
    public static void main(String[] args) {
        int number = 12345;
        int result = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + result);
    }

}
