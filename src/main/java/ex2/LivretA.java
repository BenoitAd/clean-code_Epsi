package ex2;

/**
 * Représente un compte bancaire de type Livret A.
 * Hérite de la classe abstraite CompteBancaire.
 */
public class LivretA extends CompteBancaire {

    /**
     * Constructeur de la classe LivretA.
     *
     * @param type            Le type de compte (CC pour compte courant, LA pour Livret A).
     * @param solde           Le solde initial du compte.
     * @param tauxRemuneration Le taux de rémunération annuel du Livret A.
     */
    public LivretA(Type type, double solde, double tauxRemuneration) {
        super(type, solde, 0);
        setTauxRemuneration(tauxRemuneration); // Mise à jour du taux de rémunération
    }

    /**
     * Méthode pour ajouter un montant au solde du Livret A.
     *
     * @param montant Le montant à ajouter.
     */
    @Override
    public void ajouterMontant(double montant) {
        setSolde(getSolde() + montant); // Ajout du montant au solde
    }

    /**
     * Méthode pour débiter un montant du solde du Livret A.
     *
     * @param montant Le montant à débiter.
     */
    @Override
    public void debiterMontant(double montant) {
        if (montant <= getSolde()) {
            setSolde(getSolde() - montant); // Retrait du montant du solde
        } else {
            System.out.println("Opération impossible : solde insuffisant sur le Livret A");
        }
    }

    /**
     * Méthode pour appliquer la rémunération annuelle sur le solde du Livret A.
     */
    @Override
    public void appliquerRemuAnnuelle() {
        double remuneration = getSolde() * getTauxRemuneration() / 100; // Calcul de la rémunération
        setSolde(getSolde() + remuneration); // Ajout de la rémunération au solde
        System.out.println("Rémunération annuelle appliquée : " + remuneration);
    }
}


