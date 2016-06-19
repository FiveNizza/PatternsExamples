package by.Prohorov.Prototype;

import by.Prohorov.Prototype.ConnectDB.DataBaseOpen;

public class PrototypeApp {
    public static void main(String[] args) {
        Human original = new Human();
        DataBaseOpen.getInformationFromDataBase(original, "user");
        System.out.println(original);
        Human copy = (Human) original.copy();
        System.out.println(copy);
        DataBaseOpen.getInformationFromDataBase(copy, "user1");
        System.out.println(copy);
        System.out.println(original);

//        Human original = new Human(12, "Alexandra");
//        System.out.println(original);
//        Human copy = (Human) original.copy();
//        System.out.println(copy);
//        original.setName("Maria");
//        System.out.println("Original " + original);
//        System.out.println("Copy " + copy);
//        Human tempCopy = (Human)original.copy();
//        System.out.println("nextCopy " + tempCopy);
    }
}
