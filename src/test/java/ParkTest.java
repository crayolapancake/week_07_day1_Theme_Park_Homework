import AttractionStuff.Park;
        import AttractionStuff.Playground;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.assertEquals;

public class ParkTest {
    Park park;

    @Before
    public void before(){
        park = new Park("Jumanji Jungle", 3);
    }

    @Test
    public void getName(){
        assertEquals("Jumanji Jungle", park.getName());
    }
}
