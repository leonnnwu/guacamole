package com.lwu.design.prototype;

import com.lwu.design.prototype.beast.Beast;
import com.lwu.design.prototype.mage.Mage;
import com.lwu.design.prototype.warlord.Warlord;

/**
 * Created by Leon on 4/14/16.
 */
public interface HeroFactory {
    Mage createMage();

    Warlord createWarlord();

    Beast createBeast();
}
