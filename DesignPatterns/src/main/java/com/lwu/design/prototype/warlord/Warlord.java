package com.lwu.design.prototype.warlord;

import com.lwu.design.prototype.Prototype;

/**
 * Created by Leon on 4/14/16.
 */
public abstract class Warlord extends Prototype {

    @Override
    public abstract Warlord clone() throws CloneNotSupportedException;

}
