import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class calculator1Test {

    @Test
    public void add() {

        assertEquals(calculator1.add(2,3),5);
    }
    @Test
    public void multiply() {

        assertEquals(calculator1.multiply(2,3),6);
    }
}
