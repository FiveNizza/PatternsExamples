package by.Prohorov.concreteProduct.en;

import by.Prohorov.interfaces.MouseImpl;

public class EnMouse implements MouseImpl{
    @Override
    public void click() {
        System.out.println("Click");}

    @Override
    public void doubleClick() {
        System.out.println("Double click");}

    @Override
    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Scroll up");
        else if (direction < 0)
            System.out.println("Scroll down");
        else
            System.out.println("No scrolling");
    }
}
