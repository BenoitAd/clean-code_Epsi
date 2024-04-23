package ex3;

public class Animal {
    private String nom; // Nom de l'animal
    private String type; // Type d'animal (MAMMIFERE, POISSON, SERPENT)
    private String comportement; // Comportement de l'animal (HERBIVORE, CARNIVORE)

    /**
     * Constructeur de la classe Animal.
     *
     * @param nom          Le nom de l'animal.
     * @param type         Le type de l'animal.
     * @param comportement Le comportement de l'animal.
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for type
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for comportement
     *
     * @return the comportement
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter
     *
     * @param comportement the comportement to set
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }
}
