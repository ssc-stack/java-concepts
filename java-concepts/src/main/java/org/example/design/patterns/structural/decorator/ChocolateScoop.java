package org.example.design.patterns.structural.decorator;

public class ChocolateScoop implements IceCream {
    private static final int COST=10;
    private IceCream base;

    public ChocolateScoop(IceCream base) {
        this.base=base;
    }
    @Override
    public int getCost() {
        int cost= base==null?COST: base.getCost()+COST;
        return cost;
    }

    @Override
    public String getDescription() {
        return base==null?"ChocolateScoop": base.getDescription()+":"+"ChocolateScoop";

    }
}
