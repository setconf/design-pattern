package org.pattern.adapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PS2Keyboard implements PS2Device {

    public final List<Wire> wires = Arrays.asList(
            new Wire(RED_5V),
            new Wire(WHITE),
            new Wire(GREEN),
            new Wire(BLACK),
            new Wire(BLUE),
            new Wire(GND));

    public List<Wire> getWires() {
        return Collections.unmodifiableList(wires);
    }

    public void printWiresConnectionsToRight() {
        for (Wire wire : wires) {
            wire.printWireConnectionsToRight();
        }
    }
}
