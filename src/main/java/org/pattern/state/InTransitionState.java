package org.pattern.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InTransitionState implements State {
    private static final InTransitionState instance = new InTransitionState();

    private InTransitionState() {
    }

    public static InTransitionState instance() {
        return instance;
    }

    /*
     * Business logic and state transition
     * */
    @Override
    public void updateState(Context ctx) {
        log.info("Package is in transition !!!");
        ctx.setCurrentState(OutForDeliveryState.instance());
    }
}
