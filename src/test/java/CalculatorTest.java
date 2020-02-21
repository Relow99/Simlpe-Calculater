import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    @Test
    public void add() {

        assertEquals(Calculator.add(2,3),5);
    }
    @Test
    public void multiply() {

        assertEquals(Calculator.multiply(2,3),6);
    }
}
