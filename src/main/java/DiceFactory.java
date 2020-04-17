public class DiceFactory {

    Dice dice = new Dice(20,new int[7]);

    public void makeDie () {

        System.out.println("Rolling our die with " + dice.getSides() + " sides:");
        for (int i = 0; i < 10; i++) {
            dice.roll();
            System.out.println("Roll " + (i + 1) + " the value after rolling : " + dice.getValue());

        }
    }
}
