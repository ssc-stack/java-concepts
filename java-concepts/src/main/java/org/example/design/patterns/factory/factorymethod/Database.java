package org.example.design.patterns.factory.factorymethod;

public abstract class Database {
    public void connect() {
        System.out.println("Connected to the database");
    }

    public abstract Query createQuery(String query);
}
