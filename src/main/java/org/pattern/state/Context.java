package org.pattern.state;

import lombok.Data;

@Data
public class Context {

    private State currentState;
    private String packageId;

    public Context(State currentState, String packageId) {
        this.currentState = currentState;
        this.packageId = packageId;
        if (currentState == null) this.currentState = AcknowledgedState.instance();
    }

    public void update() {
        currentState.updateState(this);
    }
}
