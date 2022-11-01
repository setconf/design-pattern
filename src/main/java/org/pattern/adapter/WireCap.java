package org.pattern.adapter;

public class WireCap {

    public static final WireCap LooseCap = new WireCap(null);
    private final Wire wire;
    WireCap link = WireCap.LooseCap;

    public WireCap(Wire wire) {
        this.wire = wire;
    }

    public void addLinkTo(WireCap link) {
        this.link = link;
    }

    public Wire getWire() {
        return wire;
    }

    public String toString() {
        if (link.equals(WireCap.LooseCap)) {
            return "WireCap belonging to LooseCap";
        }
        return "WireCap belonging to " + wire + " is linked to " +
                link.getWire();
    }

    public WireCap getLink() {
        return link;
    }
}
