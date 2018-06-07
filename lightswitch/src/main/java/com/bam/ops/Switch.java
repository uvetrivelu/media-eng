package com.bam.ops;

/**
 * Class with functionality to flip states of Light object.
 */
public class Switch {

    /**
     * Flip light to on or off based on current state.
     * @param light
     */
    public void turnSwitch(Light light) {
        if (light.getIsOn()) {
            light.setOn(false);
        } else {
            light.setOn(true);
        }
    }
}
