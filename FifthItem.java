import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    //Creating the main method to run the program
    public static void main(String[] args) {
        //Calling the start method to begin the program
        start();
    }

    //Creating the start method to start the program
    public static void start() {
        //Creating an ArrayList to store the user's input as strings
        ArrayList<String> listOfStrings = new ArrayList<>();

        //Calling the takeUserInputs method
        takeUserInputs(listOfStrings);

        //Calling the findFifthItem method
        findFifthItem(listOfStrings);
    }

    //Creating a method called takeUserInputs to take in the user inputs as strings
    //And add them to an ArrayList until an empty string is entered
    public static void takeUserInputs(ArrayList<String> listOfStrings) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings. Press 'enter' on an empty line to end.");

        while (true) {
            //Reading the user's input as a string
            String userInput = scanner.nextLine();

            //Checking if the user's input is empty and if so break
            if (userInput.isEmpty()) {
                break;
            }

            //Adding non-empty user inputs to the ArrayList
            listOfStrings.add(userInput);
        }
    }

    //Creating a method called findFifthItem to find and print the fifth item in the
    //list of strings when the program ends
    public static void findFifthItem(ArrayList<String> listOfStrings) {
        //Checking to see if there are at least 5 items in the list
        if (listOfStrings.size() >= 5) {
            //Retrieving the fifth item (index 4) from the ArrayList
            String fifthItem = listOfStrings.get(4);
            //Printing the fifth item from the ArrayList
            System.out.println("The fifth item on the list is: " + fifthItem);
        } else {
            //Informing the user if there aren't enough items to find the fifth item
            System.out.println("There are not enough items on the list to find the fifth item.");
        }
    }
}
