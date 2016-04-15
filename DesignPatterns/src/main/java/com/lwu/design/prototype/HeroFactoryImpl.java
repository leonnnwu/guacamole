package com.lwu.design.prototype;

import com.lwu.design.prototype.beast.Beast;
import com.lwu.design.prototype.mage.Mage;
import com.lwu.design.prototype.warlord.Warlord;

/**
 * Created by Leon on 4/14/16.
 */
public class HeroFactoryImpl implements HeroFactory{

    private Mage mage;
    private Warlord warlord;
    private Beast beast;

    public HeroFactoryImpl(Mage mage, Warlord warlord, Beast beast) {
        this.mage = mage;
        this.warlord = warlord;
        this.beast = beast;
    }

    @Override
    public Mage createMage() {
        try {
            return mage.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Warlord createWarlord() {
        try {
            return warlord.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Beast createBeast() {
        try {
            return beast.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
