package org.example.design.patterns.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();




        flutter.setRefreshRate(12);
        UIFactory uiFactory = flutter.createUiFactory("Android");
        uiFactory.createButton();
        uiFactory.createDropDown();
    }
}
