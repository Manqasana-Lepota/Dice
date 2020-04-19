import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Die {

    //instance variable
    private int sides;
    private int value;
    private int[] probabilities;
    private int integer;

    //creating object of class Logger
    private static Logger logger = LogManager.getLogger(Die.class.getName());

    //overloaded constructor
    public Die(int numberOfSides, int... probability) {
        this.sides = numberOfSides;
        this.probabilities = probability;
    }

    // getter method for sides
    public int getSides() {
        return sides;
    }

    //setter method for sides
    public void setSides(int sides) {
        this.sides = sides;
    }

    //setter for probabilities array
    public void setProbabilities(int[] probabilities) {
        this.probabilities = probabilities;
        Die die = new Die(sides);
        die.roll();
    }

    //getter method to return value
    public int getValue() {
        return value;
    }

    /**
     * shifting range of 0-5 to 1-6
     * checking negative numbers
     * checking if the sum of numbers are greater than zero
     * checking for integer numbers
     * @return return value
     */
    public int roll() {
        int sum = 0;
        for (int x = 0; x < probabilities.length; x++) {
            sum += probabilities[x];
            if (probabilities[x] < 0) {
                logger.error("Negative numbers are not allowed");
            }
            if (probabilities[x] < 1) {
                logger.error("Sum must be greater than 0");
            }
            if (probabilities[x] == integer) {
                logger.error("Accept only numbers");
            }
        }
        value = (int) (Math.random() * sides) + 1;
        return value;
    }//end of method
}//end of class







