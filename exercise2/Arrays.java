package exercise2;


import java.util.Scanner;



public class Arrays {

    private static final Scanner scanner = new Scanner(System.in);

    //Take the arrays.js file, and refactor the code into Java in this file.
    public static void main(String[] args) {

        int[] nums = {10, 23, 3, 4, 5, 2, 1};
        System.out.println("Integer Array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        String[] greetings = {"hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا"};
        System.out.println("These are different Greetings:");
        for (int i = 0; i < greetings.length; i++) {
            System.out.println(greetings[i]);
        }

        int[] binaries = {0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};

        int intValue = 1;


        boolean boolValue;


        if (intValue <= 0) {
            boolValue = true;
        }
        else {
            boolValue = false;
        }


        System.out.println(boolValue);


    }






   // boolean[] binaries = {0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};

  //  void printNums() {};
  //  void printGreetings() {};
  //  void printBinaries() {};
}







