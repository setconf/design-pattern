package org.pattern.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Wire {

    private final String name;
    private final WireCap left;
    private final WireCap right;

    public Wire(String name) {
        this.name = name;
        this.left = new WireCap(this);
        this.right = new WireCap(this);
    }

    public void linkLeftTo(Wire link) {
        left.addLinkTo(link.getRightWireCap());
        link.getRightWireCap().addLinkTo(left);
    }

    public WireCap getRightWireCap() {
        return right;
    }

    public void printWireConnectionsToRight() {
        Wire wire = this;
        while (wire.hasLinkedRightCap()) {
            wire.printRightCap();
            wire = wire.getRightLink();
        }
    }

    public Wire getRightLink() {
        return getRightWireCap().getLink().getWire();
    }

    public void printRightCap() {
        log.info("{}", getRightWireCap());
    }

    public boolean hasLinkedRightCap() {
        return !getRightWireCap().link.equals(WireCap.LooseCap);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Wire " + name;
    }
}
