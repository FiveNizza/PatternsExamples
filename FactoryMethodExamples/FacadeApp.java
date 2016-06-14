package by.Prohorov;

public class FacadeApp {
    public static void main(String[] args) {
        CreatorPhone creatorPhone = new CreatorIPhone();
        Phone phone = creatorPhone.phoneFactoryMethod();
        phone.showPhone();
        creatorPhone = new CreatorLenovo();
        phone = creatorPhone.phoneFactoryMethod();
        phone.showPhone();
    }
}

interface Phone {
    void showPhone();
}

abstract class CreatorPhone {
    abstract Phone phoneFactoryMethod();
}

class IPhone implements Phone{
    @Override
    public void showPhone() {
        System.out.println("Create IPhone");
    }
}
class Lenovo implements Phone{
    @Override
    public void showPhone() {
        System.out.println("Create Lenovo");
    }
}

class CreatorIPhone extends CreatorPhone{
    @Override
    Phone phoneFactoryMethod() {
        return new IPhone();
    }
}

class CreatorLenovo extends CreatorPhone{
    @Override
    Phone phoneFactoryMethod() {
        return new Lenovo();
    }
}



