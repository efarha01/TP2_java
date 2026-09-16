public class CompteBancaire {

    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            this.solde += montant;
        }
    }

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > this.solde) {
            throw new SoldeInsuffisantException("Solde insuffisant pour effectuer ce retrait.");
        }
        this.solde -= montant;
    }

    public double getSolde() {
        return this.solde;
    }
}