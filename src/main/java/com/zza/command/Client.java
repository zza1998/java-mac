package com.zza.command;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Commend commend = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommend(commend);
        invoker.excuCommend();
        invoker.undoCommend();

    }
}
