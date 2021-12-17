package org.pattern.command;

import lombok.Setter;

@Setter
public class HomeAutomationRemote {
    private Command command;

    public void buttonPressed() {
        command.execute();
    }
}
