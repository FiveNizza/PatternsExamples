package by.Prohorov.Decorator;

public class DecoratorApp {
    public static void main(String[] args) {
//        IPrinter printer = new Printer("Hello");
//        IPrinter printer = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Hello"))));
        IPrinter printer = new LeftBracketDecorator(new RightBracketDecorator(new QuotesDecorator(new Printer("Hello"))));
        //IPrinter printer = new LeftBracketDecorator(new RightBracketDecorator(new Printer("Hello")));
        printer.print();
    }
}
