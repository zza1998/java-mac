package com.zza.command;

public class ConcreteCommand implements Commend {
    Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.action();
    }

    @Override
    public void undo() {
        receiver.unaction();
    }
}
