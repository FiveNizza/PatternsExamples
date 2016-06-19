package by.Prohorov.Decorator;

public class RightBracketDecorator extends Decorator{
    public RightBracketDecorator(IPrinter component) {
        super(component);
    }

    @Override
    public void print() {
        component.print();
        System.out.print("]");
    }
}
