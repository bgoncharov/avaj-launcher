package avaj.simulator;

import java.util.ArrayList;

abstract public class Tower {
    private ArrayList<Flyable> observers = new ArrayList<>();

    public void register(Flyable flyable) {

    }

    public void unregister(Flyable flyable) {

    }

    protected void conditionsChanged() {

    }
}
