package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 */
public abstract class CompteBancaire {

    /**
     * solde : solde du compte
     */
    private double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    private double decouvert;

    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    private double tauxRemuneration;

    /**
     * Le type vaut soit CC=Compte courant, ou soit LA=Livret A
     */
    public enum Type {
        CC, // Compte courant
        LA // Livret A
    }

    private Type type = Type.CC; // Initialisation à Compte courant par défaut

    /**
     * @param type
     * @param solde
     * @param decouvert
     */
    public CompteBancaire(Type type, double solde, double decouvert) {
        super();
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public abstract void ajouterMontant(double montant);

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public abstract void debiterMontant(double montant);

    public abstract void appliquerRemuAnnuelle();

    /**
     * Getter for solde
     *
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Getter for decouvert
     *
     * @return the decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter
     *
     * @param decouvert the decouvert to set
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Getter for type
     *
     * @return the type
     */
    public Type getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param type the type to set
     */
    public void setType(Type type) {
        this.type = type;
    }
}
