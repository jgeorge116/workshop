public class Skeleton_Code {
    public static void main(String[] args) {
        String first = "joel";
        String last = "george";
        String full = first+last;

        PrintName(full);
        System.out.println();
        MakeSomeVariables();

    }

    /**
     * a function that prints your name
     **/

    static void PrintName(String name) {
        System.out.println("My name is " + name);
    }

    static void  MakeSomeVariables(){
        String name = "mike";
        char letter = 'f';
        int num = 10;
        boolean flag = true;
        System.out.println("Made variable " + name + " of type String" +
                        "\nMade variable " + letter + " of type char" +
                        "\nMade variable " + num + " of type integer" +
                        "\nMade variable " + flag + " of type boolean");

    }

}
