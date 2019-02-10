import java.util.Scanner;

public class Skeleton_Code {
    public static void main(String[] args) {
        //part 1: convert this statement into something that will print out 8
        addTwo(2);

        String name = "mike"; //a word or sentence. these must be surrounded with (" ")
        char letter = 'f'; //a single letter. these need to be surrounded with apostrophes (' ')
        int num = 10; //int can be any full number you want (ie. 1,2,1000, -1000, but not 2.5)
        boolean flag = true; //booleans can be true or false
        System.out.println(); //prints out a blank line. this will make the display more clear
        PrintSomeVariables(name, letter, num, flag);

        //part 2: make PrintName print out your full name
        String first = "Bill"; //change this to your first name
        String last = "Gates"; //change this to your last name
        String full = first + " " + last; //this puts together your first and last name right now, with a space in between
        PrintName(full);




        System.out.println();
        ShowIFElseifELseSatements();
        System.out.println();
        ShowExamplesWithTypicalLoops();
        System.out.println();
        EnhancedForLoopExampleWithArray();
        System.out.println();
        ShowUseOfUSerInput();
    }

    private static void addTwo(int i) {
        System.out.println(i + "+2=" + (i+2));
    }

    /**
     * a function that prints your name
     **/

    static void PrintName(String name) {
        System.out.println("My name is " + name);
    }

    /**
     * a function that shows the use of variables with different types
     **/

    static void PrintSomeVariables(String name, char letter, int num, boolean flag) {

        System.out.println("Made variable " + name + " of type String" +
                "\nMade variable " + letter + " of type char" +
                "\nMade variable " + num + " of type integer" +
                "\nMade variable " + flag + " of type boolean");

    }

    /**
     * a function that shows how conditional statements work
     **/

    static void ShowIFElseifELseSatements() {
        int num2 = 10;
        if (num2 > 30) {
            System.out.println("the number is bigger than 30");
        } else if (num2 > 20) {
            System.out.println("the number is bigger than 20");
        } else {
            System.out.println("the number is less than 20");
        }

        String randomString = "hello";
        if (randomString.equals("bye") || randomString.equals("hello")) {
            System.out.println("the if statement is true");
        } else if (randomString.equals("no") && num2 < 2) {
            System.out.println("the first else if statement is true");
        } else if (!(num2 == 2)) {
            System.out.println("the second else if statement is true");
        } else {
            System.out.println("no statements are true");
        }
    }

    /**
     * a function that shows the use of a while loop and a foor loop
     **/

    static void ShowExamplesWithTypicalLoops() {
        int num3 = 10;
        System.out.println("while loops example");
        while (num3 > 0) {
            System.out.println(num3);
            num3--;
        }
        System.out.println();
        System.out.println("for loop example");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    /**
     * a function that shows how to fill up an array and how to use an enhanced for loop to print out the contents of it
     **/

    static void EnhancedForLoopExampleWithArray() {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        System.out.println();
        System.out.println("enhanced for loop example");
        for (int vars : intArray) {
            System.out.println(vars);
        }
    }

    /**
     * a function that shows how to read user input
     **/

    static void ShowUseOfUSerInput() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("whats your name? ");
        String usersName = myScanner.nextLine();
        System.out.println("your name is " + usersName);
    }
}