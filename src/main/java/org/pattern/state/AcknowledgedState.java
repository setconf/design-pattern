package org.pattern.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AcknowledgedState implements State {
    private static final AcknowledgedState instance = new AcknowledgedState();

    private AcknowledgedState() {
    }

    public static AcknowledgedState instance() {
        return instance;
    }

    /*
     * Business logic and state transition
     * */
    @Override
    public void updateState(Context ctx) {
        log.info("Package is acknowledged !!!");
        ctx.setCurrentState(ShippedState.instance());
    }
}
