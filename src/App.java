import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int randomNO;
        int trialMIN;
        int trialMAX;
        int userGuess;

        String userName;

        //Generates random number 
        randomNO = (int) (Math.random()* 10) + 1;

        //Get user input
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        userName = userInput.nextLine();

        trialMIN = 1;
        trialMAX = 3;

        System.out.println("========================================================");
        System.out.println("                     Welcome                            ");
        System.out.println("=================    "+userName.toUpperCase()+"    ===================");
        System.out.println("========================================================");

        System.out.print("You have "+ trialMAX +" trials to guess a number."+" Enter your Guess: " );
        userGuess = userInput.nextInt();

        //Evaluate user input
        do{
            if (userGuess != randomNO) {
                System.out.print(userGuess + " is not the number. Try again: ");
                userGuess = userInput.nextInt();                
            } else{
                System.out.print("Hurray! "+userGuess+ " is the number.");
                userInput.close();
                break;
            }

            trialMIN++;
            if ((trialMIN == trialMAX) && userGuess != randomNO) {
                System.out.println("You Failed to guess the correct number.");             
                
            }
            
        }while(trialMIN < trialMAX);            

        System.out.println("No more trials allowed!");

    }
}

