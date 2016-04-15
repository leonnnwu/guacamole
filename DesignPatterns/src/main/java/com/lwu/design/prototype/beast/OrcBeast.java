package com.lwu.design.prototype.beast;

/**
 * Created by Leon on 4/14/16.
 */
public class OrcBeast extends Beast {
    @Override
    public Beast clone() throws CloneNotSupportedException {
        return new OrcBeast();
    }

    @Override
    public String toString() {
        return "Orc Beast";
    }
}
