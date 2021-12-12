package org.pattern.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OutForDeliveryState implements State {
    private static final OutForDeliveryState instance = new OutForDeliveryState();

    private OutForDeliveryState() {
    }

    public static OutForDeliveryState instance() {
        return instance;
    }

    /*
     * Business logic and state transition
     * */
    @Override
    public void updateState(Context ctx) {
        log.info("Package is out of delivery !!!");
        ctx.setCurrentState(DeliveredState.instance());
    }
}
