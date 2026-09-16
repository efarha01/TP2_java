public class Rectangle {

    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double aire() {
        return this.largeur * this.hauteur;
    }

    public double perimetre() {
        return 2 * (this.largeur + this.hauteur);
    }
}