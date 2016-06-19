package by.Prohorov.Observer;

public class ObserverApp {
    public static void main(String[] args) {
        Person vadim = new Person("Vadim");
        Person masha = new Person("Masha");
        Person pasha = new Person("Pasha");

        Publisher publisher = new Publisher();

        publisher.subscribe(vadim);
        publisher.subscribe(masha);
        publisher.publishMagazines();
        publisher.unsubscribe(vadim);
        publisher.publishMagazines();

        printMagazines(vadim);
        printMagazines(masha);
        printMagazines(pasha);
    }

    public static void printMagazines(Magazinable magazinable) {
        System.out.println(magazinable.getName());
        for (Magazine magazine : magazinable.getMagazines()) {
            System.out.println(magazine);
        }
        System.out.println();
    }
}
