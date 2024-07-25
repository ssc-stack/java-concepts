package org.example.design.patterns.factory.factorymethod;

public class MySQLDatabase extends Database {
    @Override
    public Query createQuery(String query) {
        return new SQL(query);
    }
}
