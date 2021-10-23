import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.add(2, 2), 4);
    }
}