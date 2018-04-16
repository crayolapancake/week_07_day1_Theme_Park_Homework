import AttractionStuff.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void before(){
        dodgem = new Dodgem("Jammy Dodgems", 6);
    }

    @Test
    public void getName() {
        assertEquals("Jammy Dodgems", dodgem.getName());
    }
}
