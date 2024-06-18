public class OutputNestedForLoops // class OutputNestedForLoops
{
    public static void main(String[] args) // main()
    {
        // Declare & initialize variables
        int i = 0; // outer loop variable
        int j = 0; // inner loop variable

        System.out.println("\nA nested loop that creates the specified figure for Part B.5: "); // Part B.5: A nested loop that creates specified figure
        for (i = 1; i <= 5; i++) // outer loop involving rows
        {
            for (j = 1; j <= i; j++) // inner loop involving columns (j is conditioned by i)
            {
                System.out.print("*"); // print the asterisk across
            }
            System.out.println(); // insert a new line
        }

        System.out.println("\nA nested loop that creates the specified figure for Part B.6: "); // Part B.6: A nested loop that creates another specified figure
        for (i = 5; i >= 1; i--) // outer loop involving rows
        {
            for (j = 1; j <= i; j++) // inner loop involving columns (j is conditioned by i)
            {
                System.out.print("*"); // print the asterisk
            }
            System.out.println(); // insert a new line
        }

        System.out.println("\nA nested loop that creates the specified figure for Part B.7: "); // Part B.7: A nested loop that creates yet another specified figure
        for (i = 1; i <= 5; i++) // outer loop involving rows
        {
            for (j = 1; j <= 5; j++) // inner loop involving columns
            {
                System.out.print("*"); // print the asterisk
            }
            System.out.println(); // insert a new line
        }
    } // return
} // end class