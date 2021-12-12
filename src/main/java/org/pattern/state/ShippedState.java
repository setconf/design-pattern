package org.pattern.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShippedState implements State {
    private static final ShippedState instance = new ShippedState();

    private ShippedState() {
    }

    public static ShippedState instance() {
        return instance;
    }

    /*
     * Business logic and state transition
     * */
    @Override
    public void updateState(Context ctx) {
        log.info("Package is shipped !!!");
        ctx.setCurrentState(InTransitionState.instance());
    }
}
