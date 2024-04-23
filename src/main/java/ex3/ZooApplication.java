package ex3;

import java.util.List;

import static java.util.Arrays.asList;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        List<Animal> animaux = asList(
            new Animal("Lion", "MAMMIFERE", "CARNIVORE"),
            new Animal("Zèbre", "MAMMIFERE", "HERBIVORE"),
            new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"),
            new Animal("Panthère", "MAMMIFERE", "CARNIVORE"),
            new Animal("Requin blanc", "POISSON", "HERBIVORE"),
            new Animal("Truite dorée", "POISSON", "HERBIVORE"),
            new Animal("Boa constrictor", "SERPENT", "CARNIVORE"),
            new Animal("Python", "SERPENT", "CARNIVORE")
        );

        zoo.addAnimaux(animaux);
    }

}
