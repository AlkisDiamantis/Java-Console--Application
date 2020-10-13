
package MyPkg;

import java.util.Scanner;

public class ValidInput {
    //****************************************INTEGER VALIDATION**********************************//
        public static int validInteger(Scanner input, int from, int to) {
        int x;
        do {
            System.out.print("Enter Number (between " + from + "-" + to + ") Here : ");
            while (!input.hasNextInt()) {
                System.out.print("Please enter a number between " + from + "-" + to + ": ");
                input.next();
            }

            x = input.nextInt();
        } while (x < from || x > to);

        return x;
    }

    
}
