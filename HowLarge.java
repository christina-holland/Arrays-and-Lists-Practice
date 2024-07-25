import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
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

        //Calling the displayListSize method
        displayListSize(listOfStrings);
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

    //Creating a method called displayListSize to find and print the size of the list when the program ends
    public static void displayListSize(ArrayList<String> listOfStrings) {
        //Printing the size of the list
        System.out.println("The total amount of items in the list was: " + listOfStrings.size());
    }
}

