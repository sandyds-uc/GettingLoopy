import java.util.Random; // import Random class
import java.util.Scanner; // import Scanner class

public class DieRoller // class DieRoller
{
    public static void main(String[] args) // main()
    {
        // Declare & initialize variables
        Random rnd = new Random(); // variable to generate random number for dice roll
        Scanner in = new Scanner(System.in); // variable to scan user input
        int die1 = 0; // variable for first die 1
        int die2 = 1; // variable for die 2
        int die3 = 2; // variable for die 3
        int dieRoll = 0; // variable for sum of the three dice rolled each throw
        int throwNum = 0; // variable for num of rolls in one round
        int gameNum = 0; // variable for num of games played for entire session
        int throwNumTotal = 0; // variable for total num of rolls for entire session
        int cumDieRoll = 0; // variable for sum of dice rolls for one round
        int dieRollTotal = 0; // variable for sum of dice rolls for entire session
        double avgDieRollTotal = 0.0; // variable for overall average 3 dice roll in a session
        double avgRolls = 0.0; // variable for the average number of rolls across an entire session
        boolean isFinished = false; // variable used to keep playing during a session
        String userAcknowledge = "S"; // variable to stall before the user can start
        String isDone = "N"; // variable to terminate loop
        String userName = " "; // variable user's name to customize the program a little

        System.out.print("Username: "); // output prompt to enter useraName
        userName = in.nextLine(); // input userName into a variable

        System.out.println("\nRoll the three dice until you get a triple (same number on each die)."); // output prompt
        System.out.print("Enter any key to start: "); // Prompt to stall so that program doesn't immediately start
        userAcknowledge = in.nextLine(); // input stalling for time variable

        do
        { // do to loop program
            System.out.println("\nAttempt  Die1  Die2  Die3   Total"); // output table header
            System.out.println("--------------------------------"); // output header & table divider

            do
            { // do to loop inner nested program
                die1 = rnd.nextInt(6) + 1; // roll for 1st die
                die2 = rnd.nextInt(6) + 1; // roll for 2nd die
                die3 = rnd.nextInt(6) + 1; // roll for 3rd die
                throwNum++; // throw number in one round
                dieRoll = die1 + die2 + die3; // add total for the individual roll
                cumDieRoll += dieRoll; // accumulate the sum of all rolls
                System.out.printf("%4d    %3d   %3d   %3d   %5d", throwNum, die1, die2, die3, dieRoll); // output rolls until three of the same kind
                System.out.println(); // return line for visuals
            } while(die1 != die2 || die2 != die3); // simulates continuous rolls until three of a kind

            System.out.print("\nAre you done [Y/N]? "); // prompt asking if user is done
            isDone = in.nextLine(); // input if done

            if (isDone.equalsIgnoreCase("N"))
            { // if input = N then
                System.out.println("\nOkay " + userName + " let's play again!"); // output play again.
                gameNum++; // add to total rounds played
                dieRollTotal += cumDieRoll; // add to total of all die rolled in entire session
                throwNumTotal += throwNum; // number of throws for entire session
            } else if (isDone.equalsIgnoreCase("Y"))
            { // if input = y then
                gameNum++; // add to total rounds played
                dieRollTotal += cumDieRoll; // add to total of all die rolled in entire session
                throwNumTotal += throwNum; // number of throws for entire session
                avgDieRollTotal = (double) dieRollTotal / throwNumTotal; // average number rolled for addition of all three dice
                avgRolls = (double) throwNumTotal / gameNum; // average number of attempts it took to get 3 in a row
                System.out.println("\nThanks for playing " + userName + "."); // Thank user for playing
                System.out.println("You played " + gameNum + " game(s)."); // Tell user how many games they played in session
                System.out.printf("On average, it took you %-4.2f time(s) to roll triples.\n", avgRolls); // Tell user avg number of attempts it took to get three in a row
                System.out.printf("The average sum of each roll was: %-4.2f. \n", avgDieRollTotal); // Tell user average sum of each roll
                if (avgDieRollTotal >= 11.5)
                { // if user avg sum of dice in a row is 11.5 or greater
                    System.out.println("Tito rolled higher dice than average. Congratulations " + userName + " you get the \"High Roller\" Trophy!"); // output reward
                }
                else if (avgDieRollTotal >= 9.5)
                {// if user avg sum of dice in a row is 9.5 - 11.5
                    System.out.println(userName + " is an average roller; " + userName + " gets a participation certificate."); // output certificate
                }
                else // if user avg sum of dice in a row is less than 9.5
                {
                    System.out.println(userName + " is a low roller; " + userName + " gets the \"Weak Sauce Trophy.\""); // output trophy
                }
                isFinished = true; // stop loop for asking if they are done.
            } else
            {
                gameNum++; // add to gameNum before each
                dieRollTotal += cumDieRoll; // add to total of all die rolled in entire session
                throwNumTotal += throwNum; // number of throws for entire session
                System.out.println("\nYou entered an invalid character, so it is assumed that you want to play again."); // validation checker for if user input is done
            }
            throwNum = 0; // refresh throwNum
            dieRollTotal = 0; //refresh dieRollTotal
        } while(!isFinished); // end do while loop
    } // return
} // end class