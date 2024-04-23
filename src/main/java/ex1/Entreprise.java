package ex1;

import java.util.Date;

/**
 * Cette classe contient des informations sur une entreprise.
 */
public class Entreprise {

    // Constante représentant le capital maximum
    private static final int CAPITAL_MAX = 3000000;

    // Attributs privés de la classe
    private int siret; // Numéro SIRET de l'entreprise
    private String nom; // Nom de l'entreprise
    private String adresse; // Adresse de l'entreprise
    private Date dateCreation; // Date de création de l'entreprise

    /**
     * Constructeur de la classe Entreprise.
     *
     * @param siret        Le numéro SIRET de l'entreprise.
     * @param nom          Le nom de l'entreprise.
     * @param adresse      L'adresse de l'entreprise.
     * @param dateCreation La date de création de l'entreprise.
     */
    public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
        this.siret = siret;
        this.nom = nom;
        this.adresse = adresse;
        this.dateCreation = dateCreation;
    }

    /**
     * Méthode pour obtenir le numéro SIRET de l'entreprise.
     *
     * @return Le numéro SIRET de l'entreprise.
     */
    public int getSiret() {
        return siret;
    }

    /**
     * Méthode pour obtenir le nom de l'entreprise.
     *
     * @return Le nom de l'entreprise.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Méthode pour obtenir l'adresse de l'entreprise.
     *
     * @return L'adresse de l'entreprise.
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Méthode pour obtenir la date de création de l'entreprise.
     *
     * @return La date de création de l'entreprise.
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * Méthode pour afficher le statut de l'entreprise.
     */
    public void afficherStatut() {
        System.out.println("Nom de l'entreprise : " + nom);
        System.out.println("Siret : " + siret);
        System.out.println("Adresse : " + adresse);
        System.out.println("Date de création : " + dateCreation);
    }

    /**
     * Méthode pour vérifier si le capital dépasse le maximum autorisé.
     *
     * @param capital Le capital de l'entreprise.
     * @return Vrai si le capital dépasse le maximum autorisé, faux sinon.
     */
    public boolean depasseCapitalMax(int capital) {
        return capital > CAPITAL_MAX;
    }
}