
// strong number logic :int num= 145
                                       //if    1!+4!+5!=num;
                                      //  then it is strong number..
public class StrongNum {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {
        int number = 145; // Example number

        if (isStrongNumber(number)) { // Corrected method call
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }
    }
}

