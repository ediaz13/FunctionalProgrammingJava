package com.soma.functional.section9;

public class ACAutomationRemote {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }
}
