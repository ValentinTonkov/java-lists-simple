import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Creating an list with ArrayList class:
        ArrayList<String> list = new ArrayList<>();
        or with LinkedList class:
        LinkedList<String> list = new LinkedList<>();
        both of them implement the List interface, so could also be used:
        List<String> list = new LinkedList<>();
         */
        ArrayList<String> list = new ArrayList<>();

        /*
        * Adding elements to the list.
        * The size of the list increases automatically
        * */
        list.add("first element");
        list.add("second element");
        list.add("third element");

        //printing the list:
        System.out.println(list);

        //removing element by its index. The first element has index 0
        list.remove(0);

        //printing the list after first remove
        System.out.println("The list after list.remove(0);\t\t" + list);

        //removing element by value
        list.remove("second element");

        //printing the list after the remove
        System.out.println("The list after list.remove(\"second element\");\t\t" + list);

        //there is one element left - it can be removed by list.remove(0);
        list.remove(0);
        System.out.println("The last element removed, the list is now empty");

        //creating a Scanner object to read from console:
        Scanner scanner = new Scanner(System.in);


        //printing messages to the console to let the user know what he has to do:
        System.out.println("Enter words and enter \"stop\" when ready. ");
        System.out.print("Enter a word: ");


        /* creating a variable input and reading the next line from the console.
        This is the first user input.
         */
        String input = scanner.nextLine();


        //the condition of the while loop checks if the user input is different from
        // the word "stop"
        while (input.equalsIgnoreCase("stop") == false) {
            //while the user enters words different from "stop", the new word entered is
            //added to the list and the user is asked to enter a new word
            list.add(input);
            System.out.print("Enter a word: ");
            //reading the new word and saving it to the variable "input"
            input = scanner.nextLine();
        }

        //searching for the phrase "word searched" in the list using the method contains()
        if (list.contains("word searched")){
            System.out.println("\"word searched\" is contained in the list");
        } else {
            System.out.println("\"word searched\" is NOT contained in the list");
        }


        //printing the lists elements in the console with foreach
        for (String s : list) {
            System.out.println(s);
        }

        //printing the elements of the list with for loop and by using method get()
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}