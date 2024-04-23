package ex3;

import java.util.List;

import java.util.List;

/**
 * Représente un zoo contenant une liste d'animaux.
 */
public class Zoo {

    /**
     * Le nom du zoo.
     */
    private String nomZoo;

    /**
     * Liste des animaux dans le zoo.
     */
    private List<Animal> Animaux;

    /**
     * Constructeur de la classe Zoo.
     *
     * @param nom Le nom du zoo.
     */
    public Zoo(String nom) {
        this.nomZoo = nom;
    }

    /**
     * Ajoute un animal à la liste des animaux du zoo.
     *
     * @param animal L'animal à ajouter.
     */
    public void addAnimal(Animal animal) {
        Animaux.add(animal);
    }

    public void addAnimaux(List<Animal> animaux) {
        Animaux.addAll(animaux);
    }

    /**
     * Affiche la liste des animaux du zoo avec leurs caractéristiques.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : Animaux) {
            System.out.println(animal.getNom() + " est un " + animal.getType() + " et il est " + animal.getComportement());
        }
    }

    /**
     * Retourne le nombre d'animaux dans le zoo.
     *
     * @return Le nombre d'animaux dans le zoo.
     */
    public int taille() {
        return Animaux.size();
    }

    /**
     * Getter for nomZoo.
     *
     * @return Le nom du zoo.
     */
    public String getNomZoo() {
        return nomZoo;
    }

    /**
     * Setter for nomZoo.
     *
     * @param nom Le nom du zoo à définir.
     */
    public void setNomZoo(String nom) {
        this.nomZoo = nom;
    }
}

