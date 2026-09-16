public class ConseillerVetements {

    private final MeteoService meteoService;

    public ConseillerVetements(MeteoService meteoService) {
        this.meteoService = meteoService;
    }

    public String conseiller(String ville) {
        int temperature = meteoService.getTemperature(ville);

        if (temperature < 10) {
            return "Porter un manteau";
        }
        return "Tenue legere";
    }
}