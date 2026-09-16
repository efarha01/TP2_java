import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidateurEmailTest {

    private ValidateurEmail validateur;

    @BeforeEach
    void setUp() {
        validateur = new ValidateurEmail();
    }

    @ParameterizedTest
    @CsvSource({
            "user@example.com, true",
            "john.doe@domain.fr, true",
            "contact@entreprise.org, true",
            "userexample.com, false",
            "user@domain, false",
            "plainaddress, false"
    })
    void testEstValide(String email, boolean resultatAttendu) {
        assertEquals(resultatAttendu, validateur.estValide(email));
    }
}