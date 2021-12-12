package org.pattern.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeliveredState implements State {
    private static final DeliveredState instance = new DeliveredState();

    private DeliveredState() {
    }

    public static DeliveredState instance() {
        return instance;
    }

    /*
     * Business logic and state transition
     * */
    @Override
    public void updateState(Context ctx) {
        log.info("Package is delivered !!!");
    }
}
