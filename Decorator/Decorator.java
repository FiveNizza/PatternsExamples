package by.Prohorov.Decorator;

public abstract class Decorator implements IPrinter{
    IPrinter component;
    public Decorator(IPrinter component) {this.component = component;}
}