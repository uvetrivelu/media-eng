package com.bam.ops;

/**
 * Light class with on/off state represented as boolean attribute.
 */
public class Light {
    private boolean isOn = false;

    private Switch switcher = new Switch();

    public Light() {
    }

    public Light(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public Switch getSwitcher() {
        return switcher;
    }
}
