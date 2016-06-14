package by.Prohorov;

abstract class AbstractOrder {
    public abstract void perform();
}

class SimpleOrder extends AbstractOrder {
    public void perform() {
        System.out.println("Simple order");
    }
}

class ExtendedOrder extends AbstractOrder {
    public void perform() {
        System.out.println("Extended order");
    }
}

enum TypeOrder {
    SIMPLE, EXTENDED
}

class OrderFactory {
    static AbstractOrder getOrderFromFactory(String type) {
        TypeOrder sign = TypeOrder.valueOf(type.toUpperCase());
        switch(sign) {
            case SIMPLE: return new SimpleOrder();
            case EXTENDED: return new ExtendedOrder();
            default:throw new EnumConstantNotPresentException(
                    TypeOrder.class, sign.name());

        }
    }
}

public class RunFactoryMethodSimplest {
    public static void main(String[] args) {
        AbstractOrder ob1 = OrderFactory.getOrderFromFactory("simple");
        AbstractOrder ob2 = OrderFactory.getOrderFromFactory("extended");
        ob1.perform();
        ob2.perform();
    }
}
