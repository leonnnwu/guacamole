package com.lwu.design.prototype.beast;

import com.lwu.design.prototype.Prototype;

/**
 * Created by Leon on 4/14/16.
 */
public abstract class Beast extends Prototype {

    @Override
    public abstract Beast clone() throws CloneNotSupportedException;
}
