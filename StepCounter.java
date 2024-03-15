import java.util.Scanner;

public class StepCounter {
    // Method that takes integer input and returns a double value
    public static double stepsToMiles(int steps) throws Exception {
        if (steps < 0) {
            // Conditional "if" block to throw Exception
            throw new Exception("Exception: Negative step count entered.");
        }
        // What to return from this method
        return steps / 2000.0;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int steps;
        boolean needInput = true;

        // Conditional "while" block that check if an input is needed
        while (needInput) {
            // User prompt
            System.out.print("Enter number of steps: ");
            // input from user
            steps = scnr.nextInt();

            try {
                // If user steps are entered as a positive integer
                System.out.printf("%.2f", stepsToMiles(steps));
                // input no longer needed, change needInput value to false
                needInput = false;
            }
            // Negative number input will throw this exception
            catch (Exception excpt) {
                // This will print the Exception message in line 9
                System.out.println(excpt.getMessage());
            }
        }
        scnr.close();
    }
}
