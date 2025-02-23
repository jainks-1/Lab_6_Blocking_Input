/*Write a program that asks the user for the lengths
of the sides of a rectangle. Again, loop the input until
it is valid.

Note: Only two measures here, the Width and the Height should be doubles…
Testing: use some simple values to confirm that the calculations are correct.

Then print
- The area and perimeter of the rectangle
- The length of the diagonal (use the Pythagorean theorem)
Note: a 3.0 by 4.0 rectangle will have a diagonal of 5.0
*/

import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        // Declare variables
        Scanner in = new Scanner(System.in);

        double width = 0.00;
        double height = 0.00;
        double perimiter = 0.00;
        double diagonal = 0.00;
        double area = 0.00;

        boolean widthValid;
        boolean heightValid;
        String trash = "";

        // get width and check input
        do {
            System.out.println("Please enter the length of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();

                widthValid = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("The input: [" + trash + "] is invalid. Must be a number.\n");

                widthValid = false;
            }
        }
        while (!widthValid);

        // get height and check input
        do {
            System.out.println("Please enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();

                heightValid = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("The input: [" + trash + "] is invalid. Must be a number.\n");

                heightValid = false;
            }
        }
        while (!heightValid);

        // do logic for outputs, then format them for printing
        area = height * width;
        String formattedArea = String.format("%.2f", area);

        diagonal = Math.sqrt((height * height) + (width * width));
        String formattedDiagonal = String.format("%.2f", diagonal);

        perimiter = (height * 2) + (width * 2);
        String formattedPerimeter = String.format("%.2f", perimiter);

        // Print outputs
        System.out.println("\nThe area of the rectangle is: [" + formattedArea + "]");
        System.out.println("The perimeter is: [" + formattedPerimeter + "].");
        System.out.println("The length of diagonal from corner to corner is: [" + formattedDiagonal + "].");

        System.exit(0);
    }
}
