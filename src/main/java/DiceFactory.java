public class DiceFactory {

    /**
     * creating a new Die
     * @param numberOfSides
     * @param probabilities
     * @return a die value
     */
    public Die makeDie(int numberOfSides, int...probabilities)  {
        Die die = new Die(numberOfSides,probabilities);
        return die;
    }//end of method
}//end of class


