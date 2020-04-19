import java.util.Scanner;

public class DieMain {

    public static void main(String[] args) {
        //local variable
        String input;
        char repeat = 0;

        //creating object of class DiceFactory
        DiceFactory factory = new DiceFactory();

        //creating scanner object
        Scanner scanner = new Scanner(System.in);

        do {
            //creating the die
            Die die6 = factory.makeDie(6);
            Die die20 = factory.makeDie(20);

            //print a number between 1 and 6 inclusive
            System.out.println("Rolling our die with " + die6.getSides() + " sides:");
            die6.roll();
            System.out.println("The value after rolling : " + die6.getValue());

            //new line
            System.out.println();

            //print a number between 1 and 20 inclusive
            System.out.println("Rolling our die with " + die20.getSides() + " sides:");
            die20.roll();
            System.out.println("The value after rolling : " + die20.getValue());

            //new line
            System.out.println();

            //constructing the weighted die
            Die dieDodgy6 = factory.makeDie(6, new int[]{1, 1, 1, 1, 1, 2});
            System.out.println("Weighted Die : " + dieDodgy6.roll());

            //creating a perfectly fair die
            Die dieFair6 = factory.makeDie(6, new int[]{1, 1, 1, 1, 1, 1});
            System.out.println("Fair Die : " + dieFair6.roll());

            //new line
            System.out.println();


            System.out.println("Do you want to continue rolling?");
            System.out.println("Type Y/N?");
            input = scanner.next();
            repeat = input.charAt(0);


        }while (repeat == 'Y' || repeat == 'y');

    }//end of main method

}//end of class
