package com.lwu.design.prototype;

/**
 * Created by Leon on 4/14/16.
 */
public abstract class Prototype implements Cloneable {

    @Override
    public abstract Object clone() throws CloneNotSupportedException;
}
