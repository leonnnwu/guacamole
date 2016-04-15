package com.lwu.design.prototype.warlord;

/**
 * Created by Leon on 4/14/16.
 */
public class OrcWarlord extends Warlord {
    @Override
    public Warlord clone() throws CloneNotSupportedException {
        return new OrcWarlord();
    }

    @Override
    public String toString() {
        return "Orc Warlord";
    }
}
