public class AlgebraSolve2x2LinearEquations {
    public static void main(String[] args)   {

        /* The task will be done in two steps
        1) calculation of essential variables
        2) Printing out the result
         */

        // 1) Calculating the essential variables
        double x = ((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * .55) - (50.2 * 2.1)); // Declaring and assigning the variable x by calculation

        double y = (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * .55 - 50.2 * 2.1); // Decalaring and assigning the variable y by calculation

        // 2) Displaying the values for x and y
        System.out.print(
                "x is: " + x + "\n y is: " + y
        );
    }
}
