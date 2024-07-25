package org.example.design.patterns.factory.abstractfactory;

public class Flutter {
    public void setTheme(String color) {
        System.out.println("Sets theme to " + color);
    }

    public void setRefreshRate(int refreshRate) {
        System.out.println("Set the refresh rate to " + refreshRate);
    }


    public UIFactory createUiFactory(String type) { // Practical Factory
        if (type == "Android") {
            return new AndroidUIFactory();
        } else {
            return new IosUIFactory();
        }
    }

}
