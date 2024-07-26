package org.example.design.patterns.structural.decorator;

public class VanillaScoop implements  IceCream {

    private static final int COST=15;
    private IceCream base;

    public VanillaScoop(IceCream base) {
        this.base=base;
    }
    @Override
    public int getCost() {
        int cost= base==null?COST: base.getCost()+COST;
        return cost;
    }

    @Override
    public String getDescription() {
        return base==null?"VanillaScoop": base.getDescription()+":"+"VanillaScoop";

    }
}
