import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void convertir_1() {
        assertEquals("1", this.fizzBuzz.convertir(1));
    }

    @Test
    void convertir_3() {
        assertEquals("Fizz", this.fizzBuzz.convertir(3));
    }

    @Test
    void convertir_5() {
        assertEquals("Buzz", this.fizzBuzz.convertir(5));
    }

    @Test
    void convertir_15() {
        assertEquals("FizzBuzz", this.fizzBuzz.convertir(15));
    }
}
