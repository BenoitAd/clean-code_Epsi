package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {
    private Capacite capacite;
    private List<Item> items;

    public Caisse(Capacite capacite) {
        this.capacite = capacite;
        this.items = new ArrayList<>();
    }

    public boolean accepteItem(Item item) {
        return item.getPoids() <= capacite.getPoidsMax();
    }

    public void ajouterItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public Capacite getCapacite() {
        return capacite;
    }

    public void setCapacite(Capacite capacite) {
        this.capacite = capacite;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}