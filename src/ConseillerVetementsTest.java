import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class ConseillerVetementsTest {

    private MeteoService meteoServiceMock;
    private ConseillerVetements conseillerVetements;

    @BeforeEach
    void setUp() {
        // 1. Création du mock
        meteoServiceMock = mock(MeteoService.class);
        // 2. Injection du mock dans notre classe à tester
        conseillerVetements = new ConseillerVetements(meteoServiceMock);
    }

    @Test
    void conseiller_TemperatureInferieureA10_devraitRecommanderManteau() {
        // Définition du comportement simulé (Stubbing)
        when(meteoServiceMock.getTemperature("Paris")).thenReturn(5);

        String conseil = conseillerVetements.conseiller("Paris");

        assertEquals("Porter un manteau", conseil);
        verify(meteoServiceMock).getTemperature("Paris");
    }

    @Test
    void conseiller_TemperatureSuperieureOuEgaleA10_devraitRecommanderTenueLegere() {
        // Définition du comportement simulé (Stubbing)
        when(meteoServiceMock.getTemperature("Nice")).thenReturn(18);

        String conseil = conseillerVetements.conseiller("Nice");

        assertEquals("Tenue legere", conseil);
        verify(meteoServiceMock).getTemperature("Nice");
    }
}