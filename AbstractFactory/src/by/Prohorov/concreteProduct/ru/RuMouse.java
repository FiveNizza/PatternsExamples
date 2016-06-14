package by.Prohorov.concreteProduct.ru;

import by.Prohorov.interfaces.MouseImpl;

public class RuMouse implements MouseImpl{
    @Override
    public void click() {
        System.out.println("Щелчок мыши");}

    @Override
    public void doubleClick() {
        System.out.println("Двойной щелчок мыши");}

    @Override
    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Скроллим вверх");
        else if (direction < 0)
            System.out.println("Скроллим вниз");
        else
            System.out.println("Не скроллим");
    }
}
