import java.util.Scanner;

public class Skeleton_Code {
    public static void main(String[] args) {
        //part 1: use function calls to check if your guess is correct
        guess(1); //guess a number between one and five
        System.out.println();
        guess(5); //The same function can give different output because of different arguments
        System.out.println();


        String name = "mike"; //a word or sentence. these must be surrounded with (" ")
        char letter = 'f'; //a single letter. these need to be surrounded with apostrophes (' ')
        int num = 10; //int can be any full number you want (ie. 1,2,1000, -1000, but not 2.5)
        boolean flag = true; //booleans can be true or false
        double decimalNumber = 3.14;
        System.out.println(); //prints out a blank line. this will make the display more clear
        PrintSomeVariables(name, letter, num, flag, decimalNumber);

        //part 2: make PrintName print out your full name
        String first = "Bill"; //change this to your first name
        String last = "Gates"; //change this to your last name
        String full = first + " " + last; //this puts together your first and last name right now, with a space in between
        System.out.println();
        PrintName(full);

        System.out.println();
        ShowIFElseifELseSatements();
        System.out.println();
        ShowExamplesWithTypicalLoops();
        System.out.println();
        EnhancedForLoopExampleWithArray();
        System.out.println();
        ShowMathOperators(8,2); //passing in 2 arguments into our function
        System.out.println();
        ShowUseOfUSerInput();
    }

    private static void guess(int i) {
        int answer = 3;
        System.out.print("Your guess is " + i + ", guess ");
        if (i < answer)
            System.out.print("higher!");
        if (i > answer)
            System.out.print("lower!");
        if (i == answer)
            System.out.print("is correct!");

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

    static void PrintSomeVariables(String name, char letter, int num, boolean flag, double aDouble) {
        System.out.println("Made variable " + name + " of type String" +
                "\nMade variable " + letter + " of type char" +
                "\nMade variable " + num + " of type integer" +
                "\nMade variable " + flag + " of type boolean" +
                "\nMade variable " + aDouble + " of type double");

    }

    /**
     * a function that shows how conditional statements work
     **/

    static void ShowMathOperators(int a, int b){
        System.out.println("'"+ a + "'" + "+" + "'" + b + "'" + "is " + (a+b));
        System.out.println("'"+ a + "'" + "-" + "'" + b + "'" + "is " + (a-b));
        System.out.println("'"+ a + "'" + "/" + "'" + b + "'" + "is " + (a/b));
        System.out.println("'"+ a + "'" + "*" + "'" + b + "'" + "is " + (a*b));
        System.out.println("'"+ a + "'" + "%" + "'" + b + "'" + "is " + (a%b)); //modulo operator (num1/num2) then takes remainder
    }

    static void ShowIFElseifELseSatements() {
        int num2 = 10;
        if(num2 > 30) {
            System.out.println("the number is bigger than 30");
        } else if (num2 > 20) {
            System.out.println("the number is bigger than 20");
        } else {
            System.out.println("the number is less than 20");
        }

        String randomString = "hello";
        if(randomString.equals("bye") || randomString.equals("hello")) { //1 statement has to be true for the whole if statment to be true
            System.out.println("the if statement is true");
        } else if (randomString.equals("no") && num2 < 2) { //both statements must be true for the whole if statement to be true
            System.out.println("the first else if statement is true");
        } else if (!(num2 == 2)) { //negates the statement if num2 == 2
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
        System.out.println("while loops example:");
        while (num3 > 0) {  //this loop will happen 10 times
            System.out.println(num3);
            num3--; //decrements the variable by 1
        }
        System.out.println();
        System.out.println("for loop example:");
        for (int i = 0; i < 10; i++) { //this loop will happen 10 times
            //i=0 is the starting condition, i<10 is the stopping condition, i++ increments i by 1
            System.out.println(i);
        }
    }

    /**
     * a function that shows how to fill up an array and how to use an enhanced for loop to print out the contents of it
     **/

    static void EnhancedForLoopExampleWithArray() {
        int[] intArray = new int[10];  //make an array of length 10
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i; //fills the ith position of the array with i
        }
        System.out.println();
        System.out.println("enhanced for loop example:");
        for (int vars : intArray) { //go through every number in the array starting at the beginning
            System.out.println(vars); //prints the number
        }
    }

    /**
     * a function that shows how to read user input
     **/

    static void ShowUseOfUSerInput() {
        Scanner myScanner = new Scanner(System.in); //creates an object that allows one to read user input
        System.out.println("whats your name? ");
        String usersName = myScanner.nextLine(); //stores the user's input into a string variable
        System.out.println("your name is " + usersName);
    }
}