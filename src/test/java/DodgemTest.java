import AttractionStuff.Attraction;
import AttractionStuff.Dodgem;
import org.junit.Before;
import org.junit.Test;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void before(){
        dodgem = new Dodgem("Jammy Dodgems", 6);
    }

    @Test
    @Test
    public void getName() {
        assertEqual("Jammy Dodgems", dodgem.getName());
    }
}
