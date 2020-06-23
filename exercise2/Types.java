package exercise2;

public class Types {
    //    This class has syntax errors, that will prevent your other classes from running.
//    So... work on this file first to resolve the issues.

    public static void main(String[] args){
    boolean myBool = true;
    int [] myArray = {3,4,5,6,76,12,2};

    String movieA = "Harry and the Henderson's";
    String movieB = "Star Wars";
    char male = 'm';
    char female = 'f';

        System.out.println(myBool);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println(movieA);
        System.out.println(movieB);
        System.out.println(male);
        System.out.println(female);
//
//    //the above instance variables have mistakes with their data types.  Fix the data types so the main method
//    //correctly displays the value of all of the variables
//
//    public static void main() {
//        System.out.println("There are variables that have been declared in this Accessible class.
//        Fix the code so that all the variables can be accessed by the main method.
//        print out the values of every variable once the code has been refactored.");
//    }
    }
}