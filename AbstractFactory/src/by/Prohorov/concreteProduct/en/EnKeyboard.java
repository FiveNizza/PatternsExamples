package by.Prohorov.concreteProduct.en;

import by.Prohorov.interfaces.KeyboardsImpl;

public class EnKeyboard implements KeyboardsImpl{
    @Override
    public void print() {
        System.out.println("Print string");}

    @Override
    public void println() {
        System.out.println("Print string with line");}
}
