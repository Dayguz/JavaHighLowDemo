import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) throws Exception {

        // create a constant that control the maximum integer returned.
        int MAX_NUMBER = 100;
       
        // Set up a random number generator
        Random numberGenerator = new Random();

        // use the number generator to create a random number
        int secretNumber = numberGenerator.nextInt(MAX_NUMBER);

        // // Iterative test: check to ensure the random value is created correctly and the values is in the right range.
        // System.out.println(secretNumber);

        // create a scanner to read in the user's responses
        Scanner inputReader = new Scanner(System.in);

        // declare a string to store responses
        String response;

        // declare a int to store the parsed guess
        int guess;

        // create a flag to control the loop
        boolean keepPlaying = true;

        // start the game loop
        while(keepPlaying){

            // prompt the user for a guess
            System.out.println("Please enter your guess.");

            // read in the users response
            response = inputReader.nextLine();

            // // Iterative test: print response in all caps to ensure we are getting data in
            // System.out.println(response.toUpperCase());

            // attempt to parse the response
            try {

                guess = Integer.parseInt(response);

            } catch (NumberFormatException error) {

                // Print an error message
                System.out.println("Error: invalid guess!");

                // the guess is invalid, restart the loop
                continue;

            }

            // check to see if the guess is less than the secret number
            if(guess < secretNumber){

                System.out.println("Your guess is too low!");

            // check to see if the guess is greater than the secret number
            } else if(guess > secretNumber){

                System.out.println("Your guess is too high!");

            // if the guess is not greater than the secret number, and not less than the secret number, then the two numbers must be the same.
            } else {

                System.out.println("You guessed correctly!");
                keepPlaying = false;

            }

        }

        System.out.println("--- Game Over ---");

    }

}
