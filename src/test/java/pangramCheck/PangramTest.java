package pangramCheck;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pangramChecker.PangramChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PangramTest {

    PangramChecker pangramChecker;


    @BeforeEach
    public void init() {
        pangramChecker = new PangramChecker();
    }


    @Test
    public void testTrue() {
        String param = "The quick brown fox jumps over the lazy dog.";
        assertEquals(true, pangramChecker.check(param));

    }

    @Test
    public void testFalse() {
        String param = "AAAA";
        assertEquals(false, pangramChecker.check(param));
    }
}
