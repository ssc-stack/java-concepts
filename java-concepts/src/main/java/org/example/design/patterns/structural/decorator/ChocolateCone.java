package org.example.design.patterns.structural.decorator;

public class ChocolateCone implements IceCream {

    private static final int COST=30;
    private IceCream base;

    public ChocolateCone() {

    }

    public ChocolateCone(IceCream base) {
        this.base=base;
    }

    @Override
    public int getCost() {
        int cost= base==null?COST: base.getCost()+COST;
        return cost;
    }

    @Override
    public String getDescription() {
        return base==null?"ChocolateCone": base.getDescription()+":"+"ChocolateCone";

    }
}
