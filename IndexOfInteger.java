import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    //Creating the main method to run the program
    public static void main(String[] args) {
        //Calling the start method to begin the program
        start();
    }

    //Creating the start method to start the program
    public static void start() {
        //Creating an ArrayList to store the user's input as integers
        ArrayList<Integer> listOfIntegers = new ArrayList<>();

        //Calling the takeUserInputs method
        takeUserInputs(listOfIntegers);

        //Calling the findIndexOfNumber method
        findIndexOfNumber(listOfIntegers);
    }

    //Creating a method called takeUserInputs to take in the user inputs as integers
    //And add them to an ArrayList until 0 is entered
    public static void takeUserInputs(ArrayList<Integer> listOfIntegers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers. Enter '0' to end.");

        while (true) {
            //Reading the user's input as an integer
            int userInput = Integer.valueOf(scanner.nextLine());

            //Checking if the user's input is 0 and if so break
            if (userInput == 0) {
                System.out.println("Done entering integers into the list");
                break;
            }

            //Adding non-empty user inputs to the ArrayList
            listOfIntegers.add(userInput);
        }
    }

    //Creating a method called findIndexOfNumber to find and display the index of a number in the list
    //After asking the user for the number that they want when the program ends
    public static void findIndexOfNumber(ArrayList<Integer> listOfIntegers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number are you looking for in the list?");

        //Reading the user's input as an integer
        int numberToFind = Integer.valueOf(scanner.nextLine());

        //Initializing a boolean variable called found to check if the number is found in the list
        boolean found = false;

        //Iterating through the ArrayList to find all indexes of the number
        for (int i = 0; i < listOfIntegers.size(); i++) {
            if (listOfIntegers.get(i) == numberToFind) {
                //Printing the index of the number
                System.out.println(numberToFind + " is at index " + i);
                found = true;
            }
        }

        //If the number is not found, inform the user that the number is not found in the list
        if (!found) {
            System.out.println(numberToFind + " is not found in the list.");
        }
    }
}

