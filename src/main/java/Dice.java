public class Dice {

    //instance variable
    private int sides;
    private int value;
    private int[] probabilities;


    //overloaded constructor
    public Dice(int numberOfSides, int[] probability) {
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
    }

    /**
     * shifting range of 0-5 to 1-6
     * @return return value
     */
    public int roll() {
        value = (int) (Math.random() * sides) + 1;
        return value;

    }

    //getter method to return value
    public int getValue() {
        return value;
    }
}


