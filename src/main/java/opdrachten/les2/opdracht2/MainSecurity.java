package opdrachten.les2.opdracht2;

import java.util.Scanner;

/**
 * Opdracht 2:
 * Fix two methods to check password and valid ID for user validation
 */
public class MainSecurity {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        TODO: the following line calls methods to verify a user
//          The methods aren't finished yet, that's your job.
        boolean validated = checkPassword() && checkValidID();

//        TODO: print if the user is validated or not
    }

    private static boolean checkPassword() {
        System.out.println("Please input passcode:");

//      the user must enter the following code to proceed:
//      1 [enter] 2 [enter] 3 [enter] 4
        while(true) {
            String input = scanner.next();

//            TODO:
//              - print OK if the input matches the code
//              - count the times the input doesn't match
//              - print the amount of tries if it doesn't match
//              - after 3 tries, print ALARM and exit the loop
        }

//        TODO: if the user inserted a correct code, return true
//          otherwise, return false
    }

    private static boolean checkValidID() {
//        TODO: check the ID input for validity.
//          Make sure the input matches the following conditions:
//          - must start with VIP
//          - followed by 5 numbers, use a loop
//          - followed by either 'e', 's', or 'x', use a switch
//          If the input is correct, return true
//          If the input is incorrect, notify the user to try again until the ID is valid
//          The app may never crash

        System.out.println("Please enter your ID:");
        char[] input = scanner.next().toCharArray();

        return false;
    }
}
