package com.lwu.design.prototype;

import com.lwu.design.prototype.beast.Beast;
import com.lwu.design.prototype.beast.ElfBeast;
import com.lwu.design.prototype.beast.OrcBeast;
import com.lwu.design.prototype.mage.ElfMage;
import com.lwu.design.prototype.mage.Mage;
import com.lwu.design.prototype.mage.OrcMage;
import com.lwu.design.prototype.warlord.ElfWarlord;
import com.lwu.design.prototype.warlord.OrcWarlord;
import com.lwu.design.prototype.warlord.Warlord;

/**
 * Created by Leon on 4/14/16.
 */
public class App {

    public static void main(String[] args) {
        HeroFactory factory;
        Mage mage;
        Warlord warlord;
        Beast beast;

        factory = new HeroFactoryImpl(new OrcMage(), new OrcWarlord(), new OrcBeast());
        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();
        System.out.println(mage);
        System.out.println(warlord);
        System.out.println(beast);

        factory = new HeroFactoryImpl(new ElfMage(), new ElfWarlord(), new ElfBeast());
        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();
        System.out.println(mage);
        System.out.println(warlord);
        System.out.println(beast);
    }
}
