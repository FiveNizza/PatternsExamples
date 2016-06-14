package by.Prohorov.concreteFactory;

import by.Prohorov.concreteProduct.en.EnKeyboard;
import by.Prohorov.concreteProduct.en.EnMouse;
import by.Prohorov.concreteProduct.en.EnTouchPad;
import by.Prohorov.interfaces.DeviceFactoryImpl;
import by.Prohorov.interfaces.KeyboardsImpl;
import by.Prohorov.interfaces.MouseImpl;
import by.Prohorov.interfaces.TouchPadImpl;

public class EnDeviceFactory implements DeviceFactoryImpl{

    @Override
    public MouseImpl getMouse() {
        return new EnMouse();}

    @Override
    public KeyboardsImpl getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public TouchPadImpl getTouchPad() {
        return new EnTouchPad();
    }
}
