package com.lwu.design.adapter;

/**
 * Adapter class. Adapts the interface of the device ({@link FishingBoat}) into {@link BattleShip}
 */
public class BattleFishingBoat implements BattleShip{

    private FishingBoat boat;

    @Override
    public void fire() {
        System.out.println("fire!");
    }

    @Override
    public void move() {
        boat.sail();
    }
}
