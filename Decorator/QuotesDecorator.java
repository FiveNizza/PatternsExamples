package by.Prohorov.Decorator;

public class QuotesDecorator extends Decorator{
    public QuotesDecorator(IPrinter component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}
