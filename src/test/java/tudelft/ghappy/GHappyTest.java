package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void gInTheMiddle() {
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void noGHappy() {
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void notAllGAreHappy() {
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void gInTheBeginning() {
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy("gxggyygxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void gAtTheEnd() {
        GHappy ghappy = new GHappy();
        boolean result = ghappy.gHappy("gxggyygxg");
        Assertions.assertFalse(result);
    }
}
