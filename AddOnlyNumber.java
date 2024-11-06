import java.util.Scanner;

public class AddOnlyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        int sum = 0;
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' && c[i] <= '9') {
                sum += c[i] - '0';
            }
        }

        // Ensure that the spaces are normal spaces (ASCII 32)
//System.out.println("The sum of only number is: " + sum);

        System.out.println("The sum of only number is: " + sum);
    }
}
