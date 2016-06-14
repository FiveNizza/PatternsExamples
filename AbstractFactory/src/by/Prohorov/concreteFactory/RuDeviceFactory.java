package by.Prohorov.concreteFactory;

import by.Prohorov.concreteProduct.ru.RuKeyboard;
import by.Prohorov.concreteProduct.ru.RuMouse;
import by.Prohorov.concreteProduct.ru.RuTouchPad;
import by.Prohorov.interfaces.DeviceFactoryImpl;
import by.Prohorov.interfaces.KeyboardsImpl;
import by.Prohorov.interfaces.MouseImpl;
import by.Prohorov.interfaces.TouchPadImpl;

public class RuDeviceFactory implements DeviceFactoryImpl{
    @Override
    public MouseImpl getMouse() {
        return new RuMouse();}

    @Override
    public KeyboardsImpl getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public TouchPadImpl getTouchPad() {
        return new RuTouchPad();
    }
}
