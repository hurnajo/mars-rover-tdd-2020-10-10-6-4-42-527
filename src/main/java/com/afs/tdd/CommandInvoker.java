package com.afs.tdd;

public class CommandInvoker {
    private iCommandExecutor commandExecutor;

    public CommandInvoker(iCommandExecutor commandExecutor){this.commandExecutor = commandExecutor;}
    void executeAction(){commandExecutor.execute();}
}
