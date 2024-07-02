import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void test1() {
//First test 8/26/1918
        assertEquals(2421832,Main.calcJulianDate(8,26,1918));
    }

    @Test
    public void test2() {
//Second test 2/8/2021
        assertEquals(2459254, Main.calcJulianDate(2,8,2021));

    }
}