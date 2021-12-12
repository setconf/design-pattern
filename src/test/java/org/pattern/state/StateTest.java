package org.pattern.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StateTest {

    @Test
    void statePatternTest() {
        String packageId = "Test123";
        Context ctx = new Context(null, packageId);
        assertEquals(AcknowledgedState.instance(), ctx.getCurrentState());

        ctx.update();
        assertEquals(ShippedState.instance(), ctx.getCurrentState());

        ctx.update();
        assertEquals(InTransitionState.instance(), ctx.getCurrentState());

        ctx.update();
        assertEquals(OutForDeliveryState.instance(), ctx.getCurrentState());

        ctx.update();
        assertEquals(DeliveredState.instance(), ctx.getCurrentState());

        ctx.update();
        assertEquals(DeliveredState.instance(), ctx.getCurrentState());
        assertEquals(ctx.getPackageId(), packageId);
    }
}
