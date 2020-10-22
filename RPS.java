import java.util.Scanner;

public class RPS {

    //Global Variables - can be accessed from any method
    static Scanner sc = new Scanner(System.in);
    static final int ROCK = 1, PAPER = 2, SCISSORS = 3; 
    static int wins = 0, losses = 0, ties = 0;
    static int humanChoice, computerChoice;

    public static void main(String[] args) {
        //variables
       
        //simulates a rock, paper, scissors game vs. a computer opponent.
        printIntro();
        do { 
            getHumanChoice();
            getComputerChoice();
            printChoices();
            calculateWinner();
        } while (wantToPlayAgain());
        printStats();

    }

    public static void printIntro() {
        int x;
        //this method prints out the intro text
        System.out.println("RPS 1.0");
        System.out.println("****************************************");
        System.out.println("Good luck, human ...");   
    }

    public static void getHumanChoice() {
        //this method gets the user's choice
        System.out.print("\nWhat do you throw? [1] Rock, [2] Paper, [3] Scissors ");
        humanChoice = sc.nextInt();
    }

    public static void getComputerChoice() {
        //this method randomly assigns a choice to the computer player
        computerChoice = (int) (Math.random() * 3 + 1);
    }

    public static void printChoices() {
        //this method prints out the human's and the computer's throws 
        if (humanChoice == ROCK) 
            System.out.print("You threw Rock! ");
        else if (humanChoice == PAPER) 
            System.out.print("You threw Paper! ");
        else if (humanChoice == SCISSORS) 
            System.out.print("You threw Scissors! ");

        if (computerChoice == ROCK)     
            System.out.println("I threw Rock!");
        else if (computerChoice == PAPER) 
            System.out.println("I threw Paper!");
        else if (computerChoice == SCISSORS) 
            System.out.println("I threw Scissors!");
    }

    public static void calculateWinner() {
        if (humanChoice == computerChoice) {
            System.out.println("Wow, a tie!?");
            ties++;
        } else if (humanChoice == ROCK && computerChoice == SCISSORS || humanChoice == PAPER && computerChoice == ROCK || humanChoice == SCISSORS && computerChoice == PAPER) {
            System.out.println("Nooo!  I lost?  But how?");
            wins++;
        } else {
            System.out.println("Haha, I win!");
            losses++;
        }
    }

    public static boolean wantToPlayAgain() {
        //this method prompts the user if they want to play again and then 
        //returns true or false depending on whether they answer y or n
        System.out.print("Do you want to play again? [y,n]: ");
        String answer = sc.next();
        return answer.equals("Y") || answer.equals("y");
    }

    public static void printStats() {
        //prints out the win/lose/tie stats at the end of the game.
        System.out.println("\nGood game!");
        System.out.println("****************************************");
        System.out.println("Wins:   " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties:   " + ties);
    }
}
