/* Write a program that asks the user to input (should all be type double):
- The number of gallons of gas in the tank
- The fuel efficiency in miles per gallon
- The price of gas per gallon
Again, use a do while loop structure for each variable (3 here!)
Then, print:
- the cost to drive 100 miles and
- how far the car can go with a full tank of gas
*/


import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        // Declare variables
        Scanner in = new Scanner(System.in);
        Double galInTank = 0.00;
        Double fuelEff = 0.00;
        Double gasPrice = 00.00;

        boolean firstValid;
        boolean secondValid;
        boolean thirdValid;
        String trash = "";

        Double costOf100Miles = 0.00;
        Double milesOnFull = 0.00;

        // get number of gallons and check input
        do {
            System.out.println("Please enter how many gallons of gas the cars tank holds: ");
            if (in.hasNextDouble()) {
                galInTank = in.nextDouble();
                in.nextLine();

                firstValid = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("The input: [" + trash + "] is invalid. Must be a number.\n");

                firstValid = false;
            }
        }
        while (!firstValid);

        // get fuel efficiency and check input
        do {
            System.out.println("Please enter the fuel efficiency of the car in mpg: ");
            if (in.hasNextDouble()) {
                fuelEff = in.nextDouble();
                in.nextLine();

                secondValid = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("The input: [" + trash + "] is invalid. Must be a number.\n");

                secondValid = false;
            }
        }
        while (!secondValid);

        // get price of gas per gallon and check input
        do {
            System.out.println("Please enter the the price of gas per gallon in the format [00.00]: ");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();

                thirdValid = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("The input: [" + trash + "] is invalid. Must be a number.\n");

                thirdValid = false;
            }
        }
        while (!thirdValid);

        // do logic for outputs, then format them to printing
        costOf100Miles = (100 / fuelEff) * gasPrice;
        String formattedCostOf100Miles = String.format("%.2f", costOf100Miles);

        milesOnFull = galInTank * fuelEff;
        String formattedMilesOnFull = String.format("%.2f", milesOnFull);

        // Print outputs
        System.out.println("\nThe cost to drive 100 miles is: [$" + formattedCostOf100Miles + "]");
        System.out.println("The car can drive: [" + formattedMilesOnFull + "] miles on a full tank.");

        System.exit(0);
    }
}
