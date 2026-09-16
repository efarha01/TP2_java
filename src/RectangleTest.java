import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void testAireEtPerimetre() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);

        assertAll("Vérification des dimensions du rectangle",
                () -> assertEquals(20.0, rectangle.aire(), "L'aire est incorrecte"),
                () -> assertEquals(18.0, rectangle.perimetre(), "Le périmètre est incorrect")
        );
    }
}