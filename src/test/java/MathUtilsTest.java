import mrk.MathUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        assertEquals(5, MathUtils.add(2, 3));
        assertEquals(0, MathUtils.add(-1, 1));
    }
}
