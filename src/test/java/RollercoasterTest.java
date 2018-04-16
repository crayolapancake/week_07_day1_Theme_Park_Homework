import AttractionStuff.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

        Rollercoaster rollercoaster;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Kek Killer", 9);
    }

    @Test
    public void getName() {
        assertEquals("Kek Killer", rollercoaster.getName());
    }
}
