package com.lwu.algo.array;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Leon on 5/21/16.
 */
public class MoveZerosTest {

    @Tested
    MoveZeroes moveZeroes;

    @Test
    public void testMoveZeroes() {
        int[] original = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};

        moveZeroes.moveZeroes(original);

        Assert.assertEquals(original, expected);
    }
}
