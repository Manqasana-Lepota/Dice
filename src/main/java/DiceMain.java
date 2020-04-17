import java.util.Scanner;

public class DiceMain {
    public static void main(String[] args) {
        //declaring local variable
        String input;
        char repeat = 0;

        DiceFactory factory = new DiceFactory();

        Scanner scanner = new Scanner(System.in);
        do {
            try {

                factory.makeDie();


            }
            catch (NegativeArraySizeException ex) {
                System.out.println(ex);

            }
            System.out.println();


            System.out.println("Do you want to continue rolling?");
            System.out.println("Type Y/N?");
            input = scanner.next();
            repeat = input.charAt(0);



        }while (repeat == 'Y' || repeat == 'y');

    }

}
