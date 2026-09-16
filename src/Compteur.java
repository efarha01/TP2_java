public class Compteur {

    private int valeur;

    public Compteur() {
        this.valeur = 0;
    }

    public void incrementer() {
        this.valeur++;
    }

    public void reinitialiser() {
        this.valeur = 0;
    }

    public int getValeur() {
        return this.valeur;
    }
}