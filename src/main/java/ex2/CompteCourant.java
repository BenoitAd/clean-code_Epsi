package ex2;

/**
 * Représente un compte bancaire de type Compte Courant.
 * Hérite de la classe abstraite CompteBancaire.
 */
public class CompteCourant extends CompteBancaire {

    /**
     * Constructeur de la classe CompteCourant.
     *
     * @param type           Le type de compte (CC pour compte courant, LA pour Livret A).
     * @param solde          Le solde initial du compte.
     * @param decouvert      Le découvert autorisé pour le compte courant.
     */
    public CompteCourant(Type type, double solde, double decouvert) {
        super(type, solde, decouvert);
    }

    /**
     * Méthode pour ajouter un montant au solde du Compte Courant.
     *
     * @param montant Le montant à ajouter.
     */
    @Override
    public void ajouterMontant(double montant) {
        setSolde(getSolde() + montant); // Ajout du montant au solde
    }

    /**
     * Méthode pour débiter un montant du solde du Compte Courant.
     *
     * @param montant Le montant à débiter.
     */
    @Override
    public void debiterMontant(double montant) {
        // Pour un compte courant, on peut débiter même si le solde est insuffisant,
        // tant que le montant ne dépasse pas le découvert autorisé
        double nouveauSolde = getSolde() - montant;
        if (nouveauSolde >= -getDecouvert()) {
            setSolde(nouveauSolde); // Mise à jour du solde
        } else {
            System.out.println("Opération impossible : dépassement du découvert autorisé");
        }
    }

    /**
     * Méthode pour appliquer la rémunération annuelle sur le solde du Compte Courant.
     * Cette méthode n'est pas applicable pour un compte courant.
     * Affiche un message d'avertissement.
     */
    @Override
    public void appliquerRemuAnnuelle() {
        System.out.println("Opération impossible : rémunération annuelle non applicable pour un compte courant");
    }
}
