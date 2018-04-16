import StallStuff.CandyFlossStall;
import StallStuff.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before() {
        iceCreamStall = new IceCreamStall("Ice Inna Vice", "C", 8, 3);
    }

    @Test
    public void getName() {
        assertEquals("Ice Inna Vice", iceCreamStall.getName());
    }

    @Test
    public void getOwnersName() {
        assertEquals("Ice Inna Vice", iceCreamStall.getOwnerName());
    }

    @Test
    public void getParking() {
        assertEquals(8, iceCreamStall.getParking());
    }

    @Test
    public void getFunRating() {
        assertEquals(3,iceCreamStall.getFunRating());
    }


}




