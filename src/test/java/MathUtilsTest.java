import mrk.MathUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        assertEquals(5, MathUtils.add(2, 3));
        assertEquals(0, MathUtils.add(-1, 1));
    }

    @Test
    public void testSqr() {
        assertEquals(4, MathUtils.square(2));
    }

    @Test
    public void test2Sqr() {
        assertEquals(4, MathUtils.square(-2));
    }

    @Test
    public void testFactorial() {
        assertEquals(2, MathUtils.factorial(2));
    }
}
