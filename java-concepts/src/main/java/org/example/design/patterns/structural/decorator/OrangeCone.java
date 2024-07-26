package org.example.design.patterns.structural.decorator;

public class OrangeCone implements IceCream {
    private static final int COST=20;
    private IceCream base;

    public OrangeCone() {

    }

    public OrangeCone(IceCream base) {
        this.base=base;
    }

    @Override
    public int getCost() {
        int cost= base==null?COST: base.getCost()+COST;
        return cost;
    }

    @Override
    public String getDescription() {
        return base==null?"OrangeCone": base.getDescription()+":"+"OrangeCone";

    }
}
