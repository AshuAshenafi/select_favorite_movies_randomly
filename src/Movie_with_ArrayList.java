/**
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * *       PSEUDOCODE    * * * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 *
 *
 *
 *
 * * * * * * * * * * * * * * * * * *       TEST DATA - 1    * * * * * * * * * * * * * * * * *  *
 *Enter your favorite Movie: Brave Heart
 * Press any key to continue or Enter (q/Q) to quit.
 * Enter your favorite Movie: We were Soldiers
 * Press any key to continue or Enter (q/Q) to quit.
 * Enter your favorite Movie: The Sound of Music
 * Press any key to continue or Enter (q/Q) to quit.
 * Enter your favorite Movie: The Shack
 * Press any key to continue or Enter (q/Q) to quit.
 * Enter your favorite Movie: War Room
 * Press any key to continue or Enter (q/Q) to quit.
 * Enter your favorite Movie: The Wire
 * Press any key to continue or Enter (q/Q) to quit.
 * Enter your favorite Movie: Broken Bad
 * Press any key to continue or Enter (q/Q) to quit.
 * Enter your favorite Movie: 24 Hour
 * Press any key to continue or Enter (q/Q) to quit. q
 * 1 - 24 Hour
 * 2 - Brave Heart
 * 3 - Broken Bad
 * 4 - The Shack
 * 5 - The Sound of Music
 * 6 - The Wire
 * 7 - War Room
 * 8 - We were Soldiers
 *
 * Wow! My favorite Movie is: The Shack
 *
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Movie_with_ArrayList {
    public static void main(String[] args) {

        // initialize new arraylist with name movies
        ArrayList<String> movies = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random();
        boolean cont = true;


        // continue prompting the user to enter colors until user type q/Q
        while (cont == true) {

            // prompt user to add favorite Movie
            System.out.print("Enter your favorite Movie: ");
            // add what the user entered
            String input = keyboard.nextLine();
            movies.add(input);

            // get ArrayList size
            int n = movies.size();
            // prompt user to continue or quit
            System.out.print("Press any key to continue or Enter (q/Q) to quit. ");
            // scan user's reply
            input = keyboard.nextLine();

            // if user hit q or Q -> quit!
            if (input.equalsIgnoreCase("q")) {
                // while loop control has to be false to get out of while loop
                cont = false;

                // print set of movies added so far in alphabetical order
                // sort list of movies
                bubblesort(movies); // method call

                // assign random number
                int fav_movie = rnd.nextInt(n-1);

                // print list of movies inserted
                for(int i = 0; i < n; i++){
                    System.out.printf("%s - %s\n", (i+1), movies.get(i));
                }
                // randomly choose favorite among movies
                System.out.println("\nWow! My favorite Movie is: " + movies.get(fav_movie));

                // get out of the loop and finish the program
                return;
            }
        }   // end of while loop
        keyboard.close();
    }    // end of main() method]

    public static void bubblesort(ArrayList <String> sorted_alist){
        int n1 = sorted_alist.size();
        for(int i = 0; i < n1-1; i++){
            for(int j = 0; j < n1-i-1; j++){
                String a = sorted_alist.get(j+1);
                String b = sorted_alist.get(j);
                if (a.compareToIgnoreCase(b) < 0) {
                    String temp = a;
                    sorted_alist.set(j+1, b);
                    sorted_alist.set(j, temp);
                }
            }
        }
    }   // end of bubblesort() class
}   // end of main class
