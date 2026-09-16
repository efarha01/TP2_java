import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatriceTest {

    private Calculatrice calculatrice;

    @BeforeEach
    void setUp() {
        calculatrice = new Calculatrice();
    }

    @Test
    void testAddition() {
        assertEquals(5, calculatrice.addition(2, 3));
        assertEquals(-1, calculatrice.addition(2, -3));
    }

    @Test
    void testSoustraction() {
        assertEquals(1, calculatrice.soustraction(3, 2));
        assertEquals(5, calculatrice.soustraction(2, -3));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculatrice.multiplication(2, 3));
        assertEquals(0, calculatrice.multiplication(5, 0));
        assertEquals(-6, calculatrice.multiplication(2, -3));
    }

    @Test
    void testDivisionValide() {
        assertEquals(2, calculatrice.division(6, 3));
        assertEquals(-2, calculatrice.division(6, -3));
    }

    @Test
    void testDivisionParZeroLeveException() {
        assertThrows(ArithmeticException.class, () -> calculatrice.division(10, 0));
    }
}