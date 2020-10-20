package com.afs.tdd.roveraction;

import com.afs.tdd.iCommandExecutor;
import com.afs.tdd.iRoverActionCommand;

public class RoverTurnLeft implements iCommandExecutor {
    private iRoverActionCommand roverActionCommand;
    public RoverTurnLeft(iRoverActionCommand roverActionCommand) {
        this.roverActionCommand = roverActionCommand;
    }

    @Override
    public void execute() {
        roverActionCommand.turnleft();
    }
}
