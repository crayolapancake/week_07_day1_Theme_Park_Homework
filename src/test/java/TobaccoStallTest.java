import StallStuff.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

     TobaccoStallTest tobaccoStallTest;

    @Before
    public void before() {
    tobaccoStallTest = new TobaccoStallTest("Baccy Bizarre", "Yellow Fingers Tam", 1, 1);
    }

    @Test
    public void getName() {
        assertEquals("Baccy Bizarre", tobaccoStallTest.getName());
    }

    @Test
    public void getOwnersName() {
        assertEquals("Yellow Fingers Tam", tobaccoStallTest.getOwnerName());
    }

    @Test
    public void getParking() {
        assertEquals(1, tobaccoStallTest.getParking());
    }

    @Test
    public void getFunRating() {
        assertEquals(1, tobaccoStallTest.getFunRating());
    }

}




