package org.example.design.patterns.factory.abstractfactory;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return null;
    }
}
