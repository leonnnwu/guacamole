package com.lwu.design.bridge.circle.impl;

import com.lwu.design.bridge.DrawAPI;

/**
 * Created by Leon on 4/14/16.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle red");
    }
}
