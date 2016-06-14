package by.Prohorov.concreteProduct.ru;

import by.Prohorov.interfaces.KeyboardsImpl;

public class RuKeyboard implements KeyboardsImpl{
    @Override
    public void print() {
        System.out.println("Печатаем строку");}

    @Override
    public void println() {
        System.out.println("Печатаем строку с переводом строки");}
}
