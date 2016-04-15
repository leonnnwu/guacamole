package com.lwu.design.prototype.mage;

/**
 * Created by Leon on 4/14/16.
 */
public class OrcMage extends Mage {
    @Override
    public Mage clone() throws CloneNotSupportedException {
        return new OrcMage();
    }

    @Override
    public String toString() {
        return "Orc Mage";
    }
}
