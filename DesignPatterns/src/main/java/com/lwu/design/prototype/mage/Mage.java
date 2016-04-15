package com.lwu.design.prototype.mage;

import com.lwu.design.prototype.Prototype;

/**
 * Created by Leon on 4/14/16.
 */
public abstract class Mage extends Prototype {

    @Override
    public abstract Mage clone() throws CloneNotSupportedException;
}
