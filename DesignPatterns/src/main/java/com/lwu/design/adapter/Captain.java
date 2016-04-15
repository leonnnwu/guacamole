package com.lwu.design.adapter;

/**
 * Created by Leon on 4/14/16.
 */
public class Captain implements BattleShip {

    private BattleShip battleShip;

    public Captain() {

    }

    public Captain(BattleShip battleShip) {
        this.battleShip = battleShip;
    }

    public void setBattleShip(BattleShip battleShip) {
        this.battleShip = battleShip;
    }

    @Override
    public void fire() {
        battleShip.fire();
    }

    @Override
    public void move() {
        battleShip.move();
    }
}
