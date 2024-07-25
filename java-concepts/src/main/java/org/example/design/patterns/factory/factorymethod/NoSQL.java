package org.example.design.patterns.factory.factorymethod;

public class NoSQL implements Query {

    private String query;

    public NoSQL(String query) {
        this.query = query;
    }

    @Override
    public void execute() {
        System.out.println("Executing NoSQL Query!");
    }

    @Override
    public String getQuery() {
        return query;
    }
}
