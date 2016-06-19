package by.Prohorov.Decorator;

public class Printer implements IPrinter{
    private String value;

    Printer(String value) {this.value = value;}
    @Override
    public void print() {
        System.out.print(value);
    }
}
