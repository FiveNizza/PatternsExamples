package by.Prohorov;

import by.Prohorov.concreteFactory.EnDeviceFactory;
import by.Prohorov.concreteFactory.RuDeviceFactory;
import by.Prohorov.interfaces.DeviceFactoryImpl;
import by.Prohorov.interfaces.KeyboardsImpl;
import by.Prohorov.interfaces.MouseImpl;
import by.Prohorov.interfaces.TouchPadImpl;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        DeviceFactoryImpl factory = getFactoryByCountryCode(1);
        MouseImpl mouse = factory.getMouse();
        KeyboardsImpl keyboard = factory.getKeyboard();
        TouchPadImpl touchPad = factory.getTouchPad();

        mouse.click();
        mouse.scroll(12);
        keyboard.print();
        keyboard.println();
        touchPad.track(12, 42);
    }

    private static DeviceFactoryImpl getFactoryByCountryCode(int code) {
        switch (code){
            case 1:
                return new RuDeviceFactory();
            case 2:
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported Country Code: " + code);
        }
    }
}
