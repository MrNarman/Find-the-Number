import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int randomNO, trialMIN, trialMAX, userGuess;
        String userName;

        //Generates random number 
        randomNO = (int) Math.random()* 10 + 1;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        userName = userInput.nextLine();

        System.out.print("Welcome "+ userName +", Enter your Guess: " );
        userGuess = userInput.nextInt();

    }
}
