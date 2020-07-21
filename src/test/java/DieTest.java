import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DieTest {

    @Test
    public void numberOfSidesSixDie () throws Exception {
        Die die6 = new Die(6);
        Assert.assertEquals(6,die6.getSides());

    }
    @Test
    public void numberOfSidesTwentyDie () {
        Die die20 = new Die(20);
        Assert.assertEquals(20,die20.getSides());
    }

    @Test
    public void weightedDie () {
        Die die = new Die(6, new int[] {1,1,1,1,1,2});
        Assert.assertEquals(6,6);
    }

    @Test
    public void fairDie () {
        Die fairDie = new Die(6,new int[] {1,1,1,1,1,1});
        Assert.assertEquals(2,2);
    }

}