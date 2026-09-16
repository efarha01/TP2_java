import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CompteBancaireTest {

    private CompteBancaire compte;

    @BeforeEach
    void setUp() {
        compte = new CompteBancaire(100.0);
    }

    @Test
    void testCasNominalDeposerEtRetirer() throws SoldeInsuffisantException {
        compte.deposer(50.0);
        assertEquals(150.0, compte.getSolde());

        compte.retirer(30.0);
        assertEquals(120.0, compte.getSolde());
    }

    @Test
    void testRetraitSuperieurAuSoldeLeveException() {
        assertThrows(SoldeInsuffisantException.class, () -> compte.retirer(150.0));
    }
}