package by.Prohorov.concreteProduct.en;

import by.Prohorov.interfaces.TouchPadImpl;

public class EnTouchPad implements TouchPadImpl{
    @Override
    public void track(int deltaX, int deltaY) {
        int temp = (int) (Math.sqrt(Math.pow(deltaX, 2)) + Math.pow(deltaY, 2));
        System.out.println("Moved " + temp + " pixels");
    }
}
