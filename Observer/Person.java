package by.Prohorov.Observer;

import java.util.ArrayList;
import java.util.List;

public class Person implements ISubscriber, Magazinable{
    private String name;

    private List<Magazine> magazines;

    public Person(String name) {
        this.name = name;
        this.magazines = new ArrayList<Magazine>();
    }


    @Override
    public List<Magazine> getMagazines() {
        return magazines;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Magazine magazine) {
        this.magazines.add(magazine);
    }
}
