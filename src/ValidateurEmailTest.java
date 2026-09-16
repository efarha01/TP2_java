import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateurEmailTest {

    private ValidateurEmail validateur;

    @BeforeEach
    void setUp() {
        validateur = new ValidateurEmail();
    }

    @Test
    void testEmailValide() {
        assertTrue(validateur.estValide("user@example.com"));
    }

    @Test
    void testEmailSansArobase() {
        assertFalse(validateur.estValide("userexample.com"));
    }

    @Test
    void testEmailNull() {
        assertFalse(validateur.estValide(null));
    }

    @Test
    void testChaineVide() {
        assertFalse(validateur.estValide(""));
    }
}