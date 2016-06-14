package by.Prohorov;

public class FactoryMethodApp {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.showProduct();
        Creator creator1 = new ConcreteCreator2();
        Product product1 = creator1.factoryMethod();
        product1.showProduct();
    }
}

interface Product {
    void showProduct();
}

class ConcreteProduct implements Product {
    @Override
    public void showProduct() {
        System.out.println("concrete product");
    }
}

class ConcreteProduct_2 implements Product {
    @Override
    public void showProduct() {
        System.out.println("concrete product 2");
    }
}

abstract class Creator {
    abstract Product factoryMethod();
    public void anOperation() {
        System.out.println("operation");
    }
}

class ConcreteCreator extends Creator {
    public Product factoryMethod() {
        this.anOperation();
        return new ConcreteProduct();
    }
}

class ConcreteCreator2 extends Creator {
    public Product factoryMethod() {
        this.anOperation();
        return new ConcreteProduct_2();
    }
}
