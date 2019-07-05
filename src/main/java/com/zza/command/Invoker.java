package com.zza.command;

public class Invoker {
    Commend commend;

    public Commend getCommend() {
        return commend;
    }

    public void setCommend(Commend commend) {
        this.commend = commend;
    }
    // 执行命令
    public void excuCommend(){
        commend.excute();
    }
    // 撤销命令
    public void undoCommend(){
        commend.undo();
    }
}
