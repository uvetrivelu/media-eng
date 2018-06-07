package com.bam.ops;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests flipping of light switch assuming one switch & one light.
 */
public class LightSwitchTest {

    @Test
    public void testSwitchOn() {
        Light light = new Light();
        light.getSwitcher().turnSwitch(light);
        Assert.assertTrue(light.getIsOn());
    }

    @Test
    public void testSwitchOff() {
        Light light = new Light(true);
        light.getSwitcher().turnSwitch(light);
        Assert.assertFalse(light.getIsOn());
    }

}
