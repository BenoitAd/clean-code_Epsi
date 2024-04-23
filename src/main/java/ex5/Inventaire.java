package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {
    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse(Capacite.PETIT));
        caisses.add(new Caisse(Capacite.MOYEN));
        caisses.add(new Caisse(Capacite.GRAND));
    }

    public void acceptItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.accepteItem(item)) {
                caisse.ajouterItem(item);
                return;
            }
        }
        System.out.println("Aucune caisse disponible pour cet article : " + item);
    }

    public int taille() {
        int totalItems = 0;
        for (Caisse caisse : caisses) {
            totalItems += caisse.getItems().size();
        }
        return totalItems;
    }

}




