/*
Write a program that has the computer generate a random int value between 1 to 10 inclusive.
The program then asks the user to guess the number with a single guess.
The program displays the random number and then indicates if the users guess was high low or on the money!
Use the do while loop again to bulletproof the guess which must be an int from 1 to 10 inclusive.
 */

import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {

        // Declare variables
        Scanner in = new Scanner(System.in);

        int userNum = 0;

        boolean firstValid;

        String trash = "";


        // get user input, validate it
        do {
            System.out.println("Please enter your guess integer between [1-10]: ");
            if (in.hasNextInt()) {
                userNum = in.nextInt();
                in.nextLine(); // Clear the buffer

                if (userNum >= 1 && userNum <= 10) {

                    firstValid = true;
                } else {
                    System.out.println("The input: [" + userNum + "] is invalid. Must be an int within [1-10].\n");

                    firstValid = false;
                }
            } else {
                trash = in.nextLine(); // Clear invalid input
                System.out.println("The input: [" + trash + "] is invalid. Must be an int within [1-10].\n");

                firstValid = false;
            }
        }
        while (!firstValid);


        System.out.println("Cont program");


        System.exit(0);
    }
}
