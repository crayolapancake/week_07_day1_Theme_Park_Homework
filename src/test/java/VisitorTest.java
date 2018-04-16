import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    Visitor visitor;


    @Before
    public void before() {
        visitor = new Visitor(30, 162, 1500);
    }

    @Test
    public void getAge(){
        assertEquals(30, visitor.getAge());
    }

    @Test
    public void getHeight(){
        assertEquals(162, visitor.getHeight());
    }

    @Test
    public void getMoney(){
        assertEquals(1500, visitor.getMoney());
    }
}
