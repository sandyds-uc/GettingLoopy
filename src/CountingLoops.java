public class CountingLoops
{
    public static void main(String[] args)
    {
        // Declare & initialize variables
        int i = 0; // variable to be used in for loops

        System.out.println("\nThis is a loop that counts up by 1 from 0 - 30: "); // Part A.1: A loop that counts up by 1 from 0 to 30
        for(i = 0; i <= 30; i++) // for loop with variable i
        {
            System.out.print(i + " "); // output i + a space for readability
        }

        System.out.println("\n\nThis is a loop that counts down by 1 from 30 - 0: "); // Part A.2: A loop that counts down by 1 from 30 to 0
        for (i = 30; i >= 0; i--) // for loop with variable i
        {
            System.out.print(i + " "); // output i + a space for readability
        }

        System.out.println("\n\nThis is a loop that counts up by 3 from 0 - 18: "); // Part A.3: A loop that counts up by 3 from 0 to 18
        for (i = 0; i <= 18; i += 3)  // for loop with variable i
        {
            System.out.print(i + " "); // output i + a space for readability
        }

        System.out.println("\n\nThis is a loop that counts down by 2 from 10 - 0: "); // Part A.4: A loop that counts down by 2 from 10 to 0
        for (i = 10; i >= 0; i -= 2) // for loop with variable i
        {
            System.out.print(i + " "); // output i + a space for readability
        }

        System.out.println(""); // insert line return at end to separate code from process summary statement
    }
}