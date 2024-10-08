import java.util.Scanner;

public class PerfectNumberCheck {

    // Method to check if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 0; // To store the sum of divisors

        // Loop to find divisors of the number
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) { // Check if 'i' is a divisor
                sum += i; // Add divisor to sum
            }
        }

        // Check if sum of divisors is equal to the number
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Input: Get the number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

boolean result=isPerfect(number);

        // Check if the number is perfect
        if (result) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        
    }
}
