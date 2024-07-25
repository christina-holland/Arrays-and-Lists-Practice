import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    //Creating the main method to run the program
    public static void main(String[] args) {
        //Creating an ArrayList to store the user's input integers
        ArrayList<Integer> listOfIntegers = new ArrayList<>();

        //Calling the takeUserInputs method
        takeUserInputs(listOfIntegers);

        //Printing the list of numbers entered by the user
        System.out.print(listOfIntegers + " were the items in the list. ");

        //Calling the getSumOfList method
        int sum = getSumOfList(listOfIntegers);
        System.out.print("The sum of that list is: " + sum);
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
                break;
            }

            //Adding non-empty user inputs to the ArrayList
            listOfIntegers.add(userInput);
        }
    }

    //Creating a method called getSumOfList to compute the sum of the integers in the list
    public static int getSumOfList(ArrayList<Integer> listOfIntegers) {
        int sum = 0;

        //Iterating through the ArrayList and finding the sum of the integers
        for (int num : listOfIntegers) {
            sum += num;
        }

        return sum;
    }
}

