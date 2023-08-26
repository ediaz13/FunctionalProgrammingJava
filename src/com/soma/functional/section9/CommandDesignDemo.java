package com.soma.functional.section9;

public class CommandDesignDemo {
    public static void main(String[] args) {

        AC ac1 = new AC();
        AC ac2 = new AC();

        ACAutomationRemote remote = new ACAutomationRemote();
        remote.setCommand(() -> ac2.turnOn());

        remote.buttonPressed();

        ac2.decTemp();
        ac1.incTemp();

    }
}
