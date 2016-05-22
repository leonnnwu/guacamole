package com.lwu.algo.array;

import mockit.Tested;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by liangwu on 5/22/16.
 */
public class MajorityElementTest {

    @Tested
    MajorityElement majorityElement;

    @Test
    public void testMojorityElement() {
        int[] input = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        Assert.assertEquals(majorityElement.majorityElement(input), 4);
    }

    @Test
    public void testBasic() {
        int[] input = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        Assert.assertEquals(majorityElement.majorityElementBasic(input), 4);
    }

    @Test
    public void testMajorityElementVoting() {
        int[] input = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        Assert.assertEquals(majorityElement.majorityElementVoting(input), 4);
    }
}
