package org.pattern.adapter;

public class PS2ToUSBAdapterDemo {

    public static void main(String[] args) {
        USBDevice adapter = new PS2ToUSBAdapter(new PS2Keyboard());
        adapter.plugInto(new USBPort());
    }
}
