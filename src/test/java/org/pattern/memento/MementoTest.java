package org.pattern.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MementoTest {

    @Test
    void mementoPatternTest() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        String state1 = "State #1";
        String state2 = "State #2";
        String state3 = "State #3";
        String state4 = "State #4";

        originator.setState(state1);
        assertEquals(state1, originator.getState());

        originator.setState(state2);
        assertEquals(state2, originator.getState());
        careTaker.add(originator.saveStateToMemento());
        assertEquals(state2, careTaker.get(0).getState());

        originator.setState(state3);
        careTaker.add(originator.saveStateToMemento());
        assertEquals(state3, careTaker.get(1).getState());

        originator.setState(state4);
        assertEquals(state4, originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        assertEquals(state2, originator.getState());
        assertEquals(originator.getState(), careTaker.get(0).getState());

        originator.getStateFromMemento(careTaker.get(1));
        assertEquals(state3, originator.getState());
        assertEquals(originator.getState(), careTaker.get(1).getState());
    }
}
