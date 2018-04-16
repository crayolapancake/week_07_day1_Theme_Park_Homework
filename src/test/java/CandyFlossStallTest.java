
import StallStuff.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Dross Floss", "The Childcatcher", 4, 5);
    }

    @Test
    public void getName() {
        assertEquals("Dross Floss", candyFlossStall.getName());
    }

    @Test
    public void getOwnersName() {
        assertEquals("The Childcatcher", candyFlossStall.getOwnerName());
    }

    @Test
    public void getParking() {
        assertEquals(4, candyFlossStall.getParking());
    }

    @Test
    public void getFunRating() {
        assertEquals(5, candyFlossStall.getFunRating());
    }

}




