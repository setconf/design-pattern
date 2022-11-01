package org.pattern.adapter;

import java.util.List;

public interface PS2Device {

    String GND = "PS/2 GND";
    String BLUE = "PS/2 Blue";
    String BLACK = "PS/2 Black";
    String GREEN = "PS/2 Green";
    String WHITE = "PS/2 White";
    String RED_5V = "PS/2 5V";

    List<Wire> getWires();

    void printWiresConnectionsToRight();
}
