import java.util.Scanner;

public class D6 {
    
    public static void main (String[] args) {
        // Variables
        Scanner sc  = new Scanner(System.in);
        int numdice = 0;   //stores how many dice to throw        
        int dieroll = 0;   //stores the result of a particular die roll
        int numsides = 0;  //stores the number of sides the dice have
        int total   = 0;   //stores the total of all the numbers rolled in a single throw of the dice.
        String ans  = "y"; //stores answer for playing again
        
        // Begin input loop
        while (ans.equals("y")) {
            
            // Get input
            System.out.print("How many dice do you want to roll? ");
            numdice = sc.nextInt();
            System.out.print("How many sides do your dice have? ");
            numsides = sc.nextInt();
            
            // Roll and add up dice 
            System.out.println("");
            System.out.print("You rolled: ");
            for (int i = 0; i < numdice; i++) {
                dieroll = rollDice(numsides);
                total = total + dieroll;
                System.out.print(dieroll + " ");
            }
            
            // Report total
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("");
            
            // Ask to continue
            System.out.print("Again? [y,n] ");
            ans = sc.next();
            System.out.println("");            
        }
    }
    
    public static int rollDice(int n) {
        return (int) (Math.random()*n)+1;
    }
    
}
