import AttractionStuff.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Blade Gauntlet", 3);
    }

    @Test
    public void getName(){
        assertEquals("Blade Gauntlet", playground.getName());
    }

//    @Test
//    public void getFunRating(){
//        assertEquals(3, playground.getFunRating());
//    }

}
