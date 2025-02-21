/* Program name: CtoFConverter
A program that converts an inputted temperature in C
and provides the equivalent temperature in F. (Hint:
Google is your friend! Given C, solve for F.) Again,
check for a valid input value and only respond with
the F value if you got it, otherwise loop until you do.

Testing: Three conditions: Bad Input, then test for the known freezing and boiling points.
Paste a screenshot or output window copy of INTELLIJ documenting your program test run(s) here.
 */
import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        // declare variables
        Scanner in = new Scanner(System.in);
        double tempCel = 0.00;
        double tempFar = 0.00;
        boolean valid;
        String trash = "";

        // input validation if/else
        do {
            System.out.println("Please enter the temperature in degrees Celsius:");
            if (in.hasNextDouble()) {
                tempCel = in.nextDouble();
                in.nextLine();

                // Format to 2 decimal points
                tempFar = (tempCel * 1.8) + 32;
                String formattedTemp = String.format("%.2f", tempFar);

                System.out.println("\n[" + tempCel + "] degrees celcius is: [" + formattedTemp + "] degrees fahrenheit.");

                if (tempFar <= 32.0){
                    System.out.println("[" + formattedTemp + "] degrees fahrenheit is at or below the freezing point of water!");

                }
                else if(tempFar >= 212.0) {
                    System.out.println("[" + formattedTemp + "] degrees fahrenheit is at or above the boiling point of water!");

                }
                valid = true;

            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered the wrong input: [" + trash + "]");
                System.out.println("Please try again.\n");

                valid = false;

            }
        }
        while(!valid);

        System.exit(0);
    }
}