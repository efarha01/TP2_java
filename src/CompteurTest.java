import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompteurTest {

    private Compteur compteur;

    @BeforeEach
    void setUp() {
        compteur = new Compteur();
        System.out.println("Debut du test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Fin du test");
    }

    @Test
    void testValeurInitialeEgaleAZero() {
        assertEquals(0, compteur.getValeur());
    }

    @Test
    void testIncrementerUneFois() {
        compteur.incrementer();
        assertEquals(1, compteur.getValeur());
    }

    @Test
    void testIncrementerTroisFoisPuisReinitialiser() {
        compteur.incrementer();
        compteur.incrementer();
        compteur.incrementer();
        compteur.reinitialiser();
        assertEquals(0, compteur.getValeur());
    }
}