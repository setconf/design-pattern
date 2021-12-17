package org.pattern.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CommandTest {

    @Test
    void commandPatternTest() {
        Light livingRoomLight = new Light();
        Fan livingRoomFan = new Fan();
        Light bedRoomLight = new Light();
        Fan bedRoomFan = new Fan();
        HomeAutomationRemote remote = new HomeAutomationRemote();

        remote.setCommand(new TurnOnLightCommand(livingRoomLight));
        remote.buttonPressed();
        assertTrue(livingRoomLight.isTurnOn());

        remote.setCommand(new TurnOnLightCommand(bedRoomLight));
        remote.buttonPressed();
        assertTrue(bedRoomLight.isTurnOn());

        remote.setCommand(new StartFanCommand(livingRoomFan));
        remote.buttonPressed();
        assertTrue(livingRoomFan.isStarted());

        remote.setCommand(new StopFanCommand(livingRoomFan));
        remote.buttonPressed();
        assertFalse(livingRoomFan.isStarted());

        remote.setCommand(new StartFanCommand(bedRoomFan));
        remote.buttonPressed();
        assertTrue(bedRoomFan.isStarted());

        remote.setCommand(new StopFanCommand(bedRoomFan));
        remote.buttonPressed();
        assertFalse(bedRoomFan.isStarted());
    }
}
