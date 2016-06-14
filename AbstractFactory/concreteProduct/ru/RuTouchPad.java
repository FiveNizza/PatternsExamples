package by.Prohorov.concreteProduct.ru;

import by.Prohorov.interfaces.TouchPadImpl;

public class RuTouchPad implements TouchPadImpl{
    @Override
    public void track(int deltaX, int deltaY) {
        int temp = (int) (Math.sqrt(Math.pow(deltaX, 2)) + Math.pow(deltaY, 2));
        System.out.println("Передвинулись на " + temp + " пикселей");
    }
}
